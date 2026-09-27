package com.conduceya.app.data

import android.content.Context
import com.conduceya.app.model.TestQuestion

object MistakesStore {

    private const val PREFS_NAME = "conduceya_mistakes"
    private const val KEY_PREFIX = "mistake_"

    fun recordMistakes(
        context: Context,
        questions: List<TestQuestion>,
        answers: List<Int?>
    ) {
        val prefs = context.getSharedPreferences(
            PREFS_NAME,
            Context.MODE_PRIVATE
        )

        val editor = prefs.edit()

        questions.forEachIndexed { index, question ->
            val answer = answers.getOrNull(index)

            if (
                answer != null &&
                answer != question.correctAnswer
            ) {
                val key = "$KEY_PREFIX${question.id}"
                val currentCount = prefs.getInt(key, 0)

                editor.putInt(
                    key,
                    currentCount + 1
                )
            }
        }

        editor.commit()
    }

    fun getMistakeCounts(
        context: Context
    ): Map<Int, Int> {

        val prefs = context.getSharedPreferences(
            PREFS_NAME,
            Context.MODE_PRIVATE
        )

        return prefs.all
            .filterKeys {
                it.startsWith(KEY_PREFIX)
            }
            .mapNotNull { (key, value) ->

                val questionId = key
                    .removePrefix(KEY_PREFIX)
                    .toIntOrNull()

                val count = value as? Int

                if (questionId != null && count != null) {
                    questionId to count
                } else {
                    null
                }
            }
            .toMap()
    }
}
