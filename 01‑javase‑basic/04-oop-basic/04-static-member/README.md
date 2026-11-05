# StaticTest - Static Field & Static Method Demo
> 《Core Java Volume I》Listing 4-3 | 《Java核心技术 卷I》程序清单4-3

## 📖 Overview / 概述
This demo illustrates the usage of **static fields** and **static methods** in Java.
A static field belongs to the class itself and is shared by all instances.
A static method has no implicit `this` parameter and cannot directly access instance variables.

本示例演示 Java **静态字段**与**静态方法**的基础用法。
静态字段归属于类，被该类所有实例共享；静态方法没有隐式 `this`，无法直接访问实例成员变量。

## ✨ Core Concept / 核心要点
- `static` field：Class-level variable, shared across all objects.
  静态字段：类级别的变量，所有对象共用同一份数据。
- `static` method：Belongs to class, call by `ClassName.method()`.
  静态方法：属于类，推荐使用 `类名.方法名()` 调用。
- Multiple `main()`：Each class can carry its own main method for unit test.
  多main方法：每个类都可以拥有独立main，用作单元测试入口。

## 📌 Execution Flow / 执行流程
1. Static variable `nextId` initial value = 1
   静态变量 `nextId` 初始值为 1
2. Every time an `Employee` object is created, it gets the current `nextId`, then `nextId` increments.
   每创建一个 Employee 对象，分配当前 id，随后 id 自增
3. Static method can be invoked independently via class name.
   静态方法支持直接通过类名单独调用

## ⚠️ Notes & Pitfalls / 注意事项
- Static methods **cannot use `this`**, cannot directly read/write non-static instance fields.
  静态方法中**不能使用 this**，不能直接访问非静态实例变量
- Instance methods can freely access static members.
  实例方法可以正常访问静态成员
- Only one `public` class is allowed in a single `.java` file.
  一个Java源文件最多只能有一个 public 类