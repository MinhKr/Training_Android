//Bài tập 4:
//Xây dựng chương trình Triangle: nhập vào 3 số a,b,c là 3 cạnh của tam giác. Xây dựng hành vi tính chu vi, diện tích tam giác được tạo từ 3 cạnh trên, chú ý kiểm tra xem a,b,c có thỏa mãn là 3 cạnh của tam giác hay không?
//- Phương thức nhập giá trị có 3 tham số để nhập giá trị đầu vào cho a,b,c
//- Phương thức tính chu vi
//- Phương thức tính diện tích tam giác
//- Phương thức inTT
fun main() {
    print("Nhập cạnh a: ")
    val canh1 = readln().toDouble()
    print("Nhập cạnh b: ")
    val canh2 = readln().toDouble()
    print("Nhập cạnh c: ")
    val canh3 = readln().toDouble()

    if(isValid(canh1,canh2,canh3) == true)
        PrintInfo(canh1 , canh2 , canh3)
    else
        print("Khong phai tam giac")
}

fun PrintInfo(a : Double,b : Double,c : Double){
    println("Chu vi: ${perimeter(a,b,c)}")
    println("Diện tích: ${area(a,b,c)}")
}

//Dien tich
fun area(a : Double,b : Double,c : Double) : Double{
    val p = (a+b+c)/2
    return (kotlin.math.sqrt(p * (p - a) * (p - b) * (p - c)))
}

//Chu vi
fun perimeter(a : Double,b : Double,c : Double) : Double{
    return(a + b + c)
}

//check dieu kien tam giac
fun isValid(a : Double,b : Double,c : Double): Boolean {
    return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)
}

