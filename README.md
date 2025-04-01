# تمرین ارث بری - شبیه ساز اپلیکیشن تجاری

دومین تمرین oop کارگاه برنامه نویسی پیشرفته با موضوع ارث بری

## توضیحات

در این تمرین از مباحث شیئ گرایی، خصوصا ارث بری برای شبیه سازی یک اپلیکیشن تجاری ساده استفاده شده که در آن مشتریان مختلف میتوانند با روشهای مختلف پرداخت های خود را انجام بدهند.

## ویژگیها

    *   روشهای پرداخت گوناگون: در نظر گرفتن سه روش پرداخت شامل "پرداخت با کارت بانکی"، "پرداخت با رمزارز"، "پرداخت با paypal" برای مشتریان.
    *   حسابهای کاربری گوناگون : در نظر گرفتن دو تیپ حساب معمولی و پریمیوم برای کاربران.

## نصب و پیاده سازی

1.  **ابتدا سورس کد را با دستور زیر کلون کنید:**

    ```
    git clone https://github.com/Bayirkentci/oop-project-store.git
    ```

2.  **سپس برای اجرای آن یکی از روشهای زیر را در پیش بگیرید**

    *   پروژه را در ide مورد نظر خود اجرا کرده و سپس کلاس main را اجرا کنید.
    *   ترمینال را باز کرده و به دیرکتوری root پروژه بروید. سپس کد را با دستورات زیر کامپایل کرده و اجرا کنید:
   ```
    javac -d bin -sourcepath src src/Main.java
    java -cp bin Main
   ``` 

## ساختار پروژه

    ```
    oop-project-store/
    ├── src/
    │   ├── main/java/
    │   │   ├── com/store/
    │   │   │   ├── models/       # Data models (Product, Customer, etc.)
    │   │   │   ├── services/    # Business logic and services
    │   │   │   ├── ui/           # User interface components
    │   │   │   ├── database/     # Database interaction classes
    │   │   │   └── Main.java     # Main entry point
    ├── README.md
    └── [Other relevant files, e.g., build scripts, data files]
    ```



