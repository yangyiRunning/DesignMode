# 设计模式

## 目录

一、面向对象设计原则

- [面向对象6大设计原则](#面向对象6大设计原则)

二、构建型模式

- [单例模式Singleton](#单例模式Singleton)
- [建造者模式Builder](#建造者模式Builder)
- [原型模式Prototype](#原型模式Prototype)
- [工厂模式Factory](#工厂模式Factory)

三、结构型模式

- [适配器模式Adapter](#适配器模式Adapter)
- [桥接模式Bridge](#桥接模式Bridge)
- [代理模式Proxy](#代理模式Proxy)
- [外观模式Facade](#外观模式Facade)
- [享元模式Flyweight](#享元模式Flyweight)

四、行为型模式

- [策略模式Strategy](#策略模式Strategy)
- [模板方法模式Template method](#模板方法模式Template method)
- [访问者模式Visitor](#访问者模式Visitor)
- [迭代器模式Iterator](#迭代器模式Iterator)
- [解释器模式Interpreter](#解释器模式Interpreter)
- [备忘录模式Memento](#备忘录模式Memento)
- [观察者模式Observer](#观察者模式Observer)
- [状态模式State](#状态模式State)

## 面向对象6大设计原则

1. 开闭原则：一个软件实体如类、模块和函数应该对修改封闭，对扩展开放。
2. 单一职责原则：一个类只做一件事，一个类应该只有一个引起它修改的原因。
3. 里氏替换原则：子类应该可以完全替换父类。也就是说在使用继承时，只扩展新功能，而不要破坏父类原有的功能。
4. 依赖倒置原则：细节应该依赖于抽象，抽象不应依赖于细节。把抽象层放在程序设计的高层，并保持稳定，程序的细节变化由低层的实现层来完成。
5. 最少知道原则：又名【迪米特法则】，一个类不应知道自己操作的类的细节，换言之，只和朋友谈话，不和朋友的朋友谈话。
6. 接口隔离原则：客户端不应依赖它不需要的接口。如果一个接口在实现时，部分方法由于冗余被客户端空实现，则应该将接口拆分，让实现类只需依赖自己需要的接口方法。

## 单例模式Singleton

- 全局使用同一个对象，分为饿汉式和懒汉式。懒汉式有双检锁和内部类两种实现方式。

## 建造者模式Builder

- 用于创建构造过程稳定的对象，不同的 Builder 可以定义不同的配置。

## 原型模式Prototype

- 为一个类定义 clone 方法，使得创建相同的对象更方便。

## 工厂模式Factory

- 为每一类对象建立工厂，将对象交由工厂创建，客户端只和工厂打交道。

## 适配器模式Adapter

- 用于有相关性但不兼容的接口，将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

## 桥接模式Bridge

- 用于同等级的接口互相组合，将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体模式或接口模式。（合成 / 聚合复用原则: 优先使用合成 / 聚合，而不是类继承）

## 代理模式Proxy

- 给某一个对象提供一个代理，并由代理对象控制对原对象的引用。

1. 静态代理
2. 动态代理

- 静态代理和动态代理之比较

```
动态代理本质上与静态代理没有区别，它的好处是节省代码量。比如被代理类有 20 个方法，而我们只需要控制其中的两个方法，就可以用动态代理通过方法名对被代理类进行动态的控制，而如果用静态方法，我们就需要将另外的 18 个方法也写出来，非常繁琐。这就是动态代理的优势所在。
```

## 外观模式Facade

- 体现的就是 Java 中封装的思想。将多个子系统封装起来，提供一个更简洁的接口供外部调用，使得两种不同的类不用直接交互，而是通过一个中间件——也就是外观类——间接交互。外观类中只需要暴露简洁的接口，隐藏内部的细节，所以说白了就是封装的思想。

## 享元模式Flyweight

- 运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用。由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式。

## 策略模式Strategy

- 定义了一系列算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。以排序算法为例。排序算法有许多种，如冒泡排序、选择排序、插入排序，算法不同但目的相同，我们可以将其定义为不同的策略，让用户自由选择采用哪种策略完成排序。

## 模板方法模式Template method

- 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。本质上为一个关于继承的设计模式。

## 访问者模式Visitor

- 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

1. 单分派
2. 双重分派

```
调用重写方法时，与对象的运行时类型有关。
调用重载方法时，只与方法签名中声明的参数类型有关，与对象运行时的具体类型无关。
```

```
程序在选择重载方法和重写方法时，如果两种情况都是动态分派的，则称之为双重分派；如果其中一种情况是动态分派，另一种是静态分派，则称之为单分派。
```

## 迭代器模式Iterator

- 列表需要提供给外部类访问，但我们不希望外部类修改其中的数据。提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节。

## 解释器模式Interpreter

- 给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。

## 备忘录模式Memento

- 在不破坏封装的条件下，通过备忘录对象存储另外一个对象内部状态的快照，在将来合适的时候把这个对象还原到存储起来的状态。

## 观察者模式Observer

- 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。

## 状态模式State

- 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。应使用多态取代条件表达式。

## 工厂设计模式

 - 简单工厂模式
 ![简单工厂模式](https://ws1.sinaimg.cn/large/006tNc79ly1g1von6zlhzj30u00xgad7.jpg)
 - 工厂方法模式
 ![工厂方法模式](https://ws4.sinaimg.cn/large/006tNc79ly1g1voogyodvj30u0115jut.jpg)
 - 抽象工厂模式
 ![抽象工厂模式](https://ws3.sinaimg.cn/large/006tNc79ly1g1vopbl5xhj30u012s798.jpg)