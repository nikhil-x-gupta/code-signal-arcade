def solution(inputArray):
    length = len(inputArray)
    product = []
    for i in range(length - 1):
        product.append(inputArray[i] * inputArray[i+1])

    return max(product)

inputArray = [3, 6, -2, -5, 7, 3]
print(solution(inputArray))