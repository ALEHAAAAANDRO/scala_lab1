import scala.util.Random

object SumLastNElementsApp extends App {

  // Генерируем случайный список из 20 чисел от 1 до 100
  val numbers: List[Int] = List.fill(20)(Random.nextInt(100) + 1)

  // Задаем количество последних элементов для суммы
  val n = 5

  // Функция для вычисления суммы последних N элементов
  def sumLastNElements(lst: List[Int], n: Int): Int = {
    lst.takeRight(n).sum
  }

  // Вычисляем и выводим результат
  val sumOfLastN = sumLastNElements(numbers, n)
  println(s"Список чисел: $numbers")
  println(s"Сумма последних $n элементов: $sumOfLastN")
}
