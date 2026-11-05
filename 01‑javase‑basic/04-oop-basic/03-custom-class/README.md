# Custom Class - Employee
> Source: Core Java Volume I Chapter 4.3 Custom Class
> Purpose: Learn how to define custom class, encapsulation, accessor & mutator methods, implicit & explicit parameters.

## 1. Knowledge Points 知识点
- Class and object: A class is a template; an object is an instance of the class.
  类与对象：类是模板，对象是类的实例。
- Encapsulation: Keep instance fields private, provide getter / setter to access data.
  封装：实例域私有化，通过getter、setter访问数据。
- Implicit parameter: `this`, refers to the current calling object.
  隐式参数：this，代表当前调用方法的对象。
- Explicit parameter: Formal parameters inside method parentheses.
  显式参数：方法括号里的形参。
- Accessor method (getter): Return field value, no modify state.
  访问器方法（getter）：返回字段值，不修改对象状态。
- Mutator method (setter): Modify field value, change object state.
  更改器方法（setter）：修改字段，改变对象状态。
- `final` instance field: Can only assign once, cannot be modified after initialization.
  final实例字段：只能赋值一次，初始化后不可修改。
- `null` reference: A reference variable that refers to no object.
  null引用：不指向任何对象的引用。
- `var`: Local variable type inference (Java 10+).
  var：局部变量类型推断（Java10及以上）。

## 2. Code Description 代码说明
- `Employee.java`: Custom class definition, private fields, constructor, getters, raiseSalary() mutator.
  自定义类定义，私有成员域、构造器、getter、加薪更改器方法。
- `EmployeeTest.java`: Test class, create Employee objects, call methods, print information.
  测试类，创建员工对象、调用方法、打印信息。

## 3. Key Summary 核心总结
1. In Java, all methods belong to classes.
   Java中所有方法都必须写在类内部，不存在独立函数。
2. We should hide data as much as possible — the core idea of encapsulation.
   尽量隐藏数据，这就是封装的核心思想。
3. Methods operate on the implicit parameter `this`.
   方法操作的对象就是隐式参数 this。
4. Do not return mutable private objects directly (defensive copy, follow-up).
   不要直接返回可变私有对象（防御性拷贝，后续学习）。

## 4. Questions & Notes 疑问记录
> Write down your confusion here when studying.
> 学习时把疑问写在这里。