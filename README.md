## Project Tutorials 2

### Phần I: Spring Boot Properties, Logging, AOP, Validation

#### 1) Cấu hình ứng dụng
* **Cấu hình ứng dụng trong resources**
![API 1A](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.1.png)

#### 2) Tạo Dto và controller
* **Tạo EmployeeDto:**
![API 2A](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.2.1.png)
* **Tạo DepartmentDto:**
![API 2B](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.2.2.png)
* **Tạo API để test valid EmployeeDto:**
![API 2C](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/2.png)
* **Tạo API để test valid DepartmentDto:**
![API 2D](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/1.png)
* **Result API EmployeeDto:**
![API 2E](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.2.9.png)
* **Result API DepartmentDto:**
![API 2F](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.2.10.png)
* **Test Validation name của EmployeeDto:**
![API 2G](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.2.3.png)
* **Test Validation email của EmployeeDto:**
![API 2H](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.2.4.png)
* **Test Validation deptname của DepartmentDto:**
![API 2I](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.2.5.png)
* **Test Validation description của DeparmentDto:**
![API 2J](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/I.2.6.png)

#### 3) Tạo service và DemoLogger
* **Tạo EmployeeService:**
![API 3A](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/3.png)
* **Tạo DepartmentService:**
![API 3B](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/4.png)
* **Tạo EmployeeServiceImpl:**
![API 3C](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/5.png)
* **Tạo DeparmentServiceImpl:**
![API 3D](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/6.png)
* **Tạo DemoLogger:**
![API 3E](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/7.png)

### Phần I: Exception, Filter, Interceptor

#### 1) Sử dụng Interceptor để logging
* **Tạo class DemoInterceptor và config:**
![API 4A](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/8.png) 
![API 4B](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/9.png)


#### 2) Sử dụng filter
* **Tạo class DemoFilter:**
![API 5A](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/10.png)
![API 5B](https://github.com/Bachos0605/Practice_17-2/blob/main/Project_2/demo/src/main/resources/Static/II.2.png)


