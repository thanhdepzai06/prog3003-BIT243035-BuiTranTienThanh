# Java NetBeans Maven Assignment

Project này gồm 4 bài theo yêu cầu:

- **Bài 1**: Generic Method (`printArray`)
- **Bài 2**: Setter Injection (`MessageService`, `EmailService`, `SMSService`, `Notification`)
- **Bài 3**: Stream + Collectors với `Employee`
- **Bài 4**: Ứng dụng giao diện máy tính Calculator bằng Java Swing

## Cấu trúc project

```text
java-assignment/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/example/
                ├── bai1/GenericMethodDemo.java
                ├── bai2/MessageService.java
                ├── bai2/EmailService.java
                ├── bai2/SMSService.java
                ├── bai2/Notification.java
                ├── bai2/SetterInjectionDemo.java
                ├── bai3/Employee.java
                ├── bai3/EmployeeStreamDemo.java
                └── bai4/CalculatorApp.java
```

## Cách mở bằng NetBeans

1. Mở **NetBeans**
2. Chọn **File -> Open Project**
3. Chọn thư mục `java-assignment`
4. Đợi NetBeans tải Maven project

## Cách chạy từng bài

### Bài 1
Chạy class:
`com.example.bai1.GenericMethodDemo`

### Bài 2
Chạy class:
`com.example.bai2.SetterInjectionDemo`

### Bài 3
Chạy class:
`com.example.bai3.EmployeeStreamDemo`

### Bài 4
Chạy class:
`com.example.bai4.CalculatorApp`

## Cách build bằng Maven

```bash
mvn clean package
```

## Gợi ý đẩy lên GitHub

Vì ở đây không thể tự đẩy repo lên GitHub thay bạn, bạn có thể làm nhanh như sau:

```bash
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin <LINK_REPO_GITHUB_CUA_BAN>
git push -u origin main
```

Sau đó nộp link repo GitHub của bạn.
