private int[] numbers = new int[10]; // Almacena los números ingresados
private int totalCount = 0;          // Cantidad de números almacenados

// Agrega un nuevo número al arreglo
public void addNumber(int number) {
    if (totalCount < numbers.length) {
        numbers[totalCount++] = number;
    } else {
        System.out.println("Límite de números alcanzado.");
    }
}

// Retorna la suma de los números almacenados
public int getSumOfNumbers() {
    int sum = 0;
    for (int index = 0; index < totalCount; index++) {
        sum += numbers[index];
    }
    return sum;
}

// Calcula el promedio de los números ingresados
public double calculateAverage() {
    if (totalCount == 0) {
        return 0;
    }
    return (double) getSumOfNumbers() / totalCount;
}
