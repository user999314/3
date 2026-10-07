// ЗАДАНИЕ 1
// Денежные переводы
// Комиссия 0.75%, минимум 35 рублей

fun main() {
    println("========== ЗАДАНИЕ 1 ==========")

    val amount = 5000.0 // сумма перевода в рублях

    var commission = amount * 0.0075 // 0.75% от суммы

    if (commission < 35.0) {
        commission = 35.0 // минимальная комиссия
    }

    println("Сумма перевода: $amount руб.")
    println("Комиссия: $commission руб.")


//  ЗАДАНИЕ 2
// Люди/Человеки
// Правильное склонение слова "лайк" в зависимости от числа

    println("\n========== ЗАДАНИЕ 2 ==========")

    val likes = 21 // число лайков

    val lastDigit = likes % 10
    val lastTwoDigits = likes % 100

    val word = when {
        lastTwoDigits in 11..14 -> "лайков"
        lastDigit == 1 -> "лайк"
        lastDigit in 2..4 -> "лайка"
        else -> "лайков"
    }

    println("$likes $word")


// ЗАДАНИЕ 3
// Меломан
// Скидки: 0-1000 — нет, 1001-10000 — 100 руб, от 10001 — 5%
// Постоянным покупателям — доп. 1% сверху

    println("\n========== ЗАДАНИЕ 3 ==========")

    val purchase = 10000.0          // сумма покупки в рублях
    val isRegularCustomer = true    // постоянный покупатель (Boolean)

    var price = purchase

    // Основная скидка
    when {
        purchase in 0.0..1000.0 -> {
            // скидки нет
        }
        purchase in 1001.0..10000.0 -> {
            price = purchase - 100.0
        }
        purchase >= 10001.0 -> {
            price = purchase * 0.95 // скидка 5%
        }
    }

    // Дополнительная скидка 1% для постоянных покупателей
    if (isRegularCustomer) {
        price *= 0.99
    }

    println("Сумма покупки: $purchase руб.")
    println("Постоянный покупатель: ${if (isRegularCustomer) "да" else "нет"}")
    println("Итоговая цена: ${"%.2f".format(price)} руб.")
}