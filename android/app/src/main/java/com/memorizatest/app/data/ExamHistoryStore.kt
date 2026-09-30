package com.memorizatest.app.data

import android.content.Context

data class ExamStats(
    val totalTests: Int,
    val passedTests: Int,
    val totalErrors: Int,
    val recentErrors: List<Int>
) {
    val failedTests: Int
        get() = totalTests - passedTests

    val averageErrors: Double
        get() = if (totalTests == 0) {
            0.0
        } else {
            totalErrors.toDouble() / totalTests
        }

    val passRate: Int
        get() = if (totalTests == 0) {
            0
        } else {
            ((passedTests.toDouble() / totalTests) * 100).toInt()
        }
}

object ExamHistoryStore {

    private const val PREFS_NAME = "memorizatest_exam_history"
    private const val KEY_TOTAL = "total_tests"
    private const val KEY_PASSED = "passed_tests"
    private const val KEY_TOTAL_ERRORS = "total_errors"
    private const val KEY_RECENT = "recent_errors"

    fun recordExam(
        context: Context,
        errors: Int,
        passed: Boolean
    ) {
        val prefs = context.getSharedPreferences(
            PREFS_NAME,
            Context.MODE_PRIVATE
        )

        val currentRecent = prefs
            .getString(KEY_RECENT, "")
            .orEmpty()
            .split(",")
            .mapNotNull { it.toIntOrNull() }
            .toMutableList()

        currentRecent.add(0, errors)

        val trimmedRecent = currentRecent
            .take(10)
            .joinToString(",")

        prefs.edit()
            .putInt(
                KEY_TOTAL,
                prefs.getInt(KEY_TOTAL, 0) + 1
            )
            .putInt(
                KEY_PASSED,
                prefs.getInt(KEY_PASSED, 0) +
                    if (passed) 1 else 0
            )
            .putInt(
                KEY_TOTAL_ERRORS,
                prefs.getInt(KEY_TOTAL_ERRORS, 0) + errors
            )
            .putString(
                KEY_RECENT,
                trimmedRecent
            )
            .commit()
    }

    fun getStats(
        context: Context
    ): ExamStats {

        val prefs = context.getSharedPreferences(
            PREFS_NAME,
            Context.MODE_PRIVATE
        )

        val recent = prefs
            .getString(KEY_RECENT, "")
            .orEmpty()
            .split(",")
            .mapNotNull { it.toIntOrNull() }

        return ExamStats(
            totalTests = prefs.getInt(KEY_TOTAL, 0),
            passedTests = prefs.getInt(KEY_PASSED, 0),
            totalErrors = prefs.getInt(KEY_TOTAL_ERRORS, 0),
            recentErrors = recent
        )
    }
}
