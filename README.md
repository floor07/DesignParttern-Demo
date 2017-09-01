# DesignParttern-Demo
Head first DesignParttern 书中的例子，结合自己经验，生成的项目。
这个就是仅仅记录，设计模式Demo

# 模式汇总

1. [观察者](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/observer)  
2. [装饰者](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/decorator)  
3. [工厂与抽象工厂](https://github.com/floor07/DesignParttern-Demo/blob/master/src/main/java/factory)  
4. [单例](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/singleton)  
5. [命令模式](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/command)
6. [适配器](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/adapter)
7. [模板](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/template)
8. [迭代器](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/iterator)
9. [组合](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/component)
10. [状态模式](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/state)    
11. [代理模式](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/proxy)
  
# 用到的设计原则  
- 封装变化--把软件中那些在将来可能产生变化的地方独立出来，与其他部分分割以减少变化时对它们的影响。这样的设计可以使系统变得有弹性，更好地应对变化。 

- 针对接口编程，而不针对实现编程。依据该原则，声明一个变量时要把它声明为超类型（接口或抽象类），而不是实现类。 

- 多用组合，少用继承。使用组合的方式可以实现代码的分割，使代码有更大的弹性，更好地提高了复用性。 

- 努力在交互对象之间实现松耦合，使它们之间的互相依赖降到最低，从而提高可复用性。 

- 类应该对扩展开放，对修改关闭。这就是我们常说的开放-关闭原则。 

- 要依赖抽象，不要依赖具体类。这个原则又被称为“依赖倒置原则（Dependency Inversion Principle）”。 

# 部分模式简单图解说明

1. 观察者模式  
- 一句话说明：  
定义对象之间的一对多依赖，当一个对象状态改变时，他的所有依赖者都会接收到通知并自动更新。     

- 情景图：  
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/observer/observer.png?raw=true)  
  
- UML图  

![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/observer/observer-uml.png?raw=true)  
  

2. 装饰者模式  
- 一句话说明  
动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。  

- 情境图  

![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/decorator/decorator.png?raw=true)
  
- UML图
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/decorator/decorator-uml.png?raw=true)
  

  
3. 工厂模式  
  
- 一句话说明
定义一个创建对象的接口，但由子类决定实例化的类是哪一个，工厂方法让类实例化推迟到子类。
- 情景图  

![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/factory/%E5%B7%A5%E5%8E%82%E6%83%85%E6%99%AF.jpg?raw=true)  

- UML图   

![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/factory/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95.jpg?raw=true)


4. 抽象工厂
- 一句话说明  
提供一个接口，用于创建相关或依赖的对象家族，而不需要名称指定具体类。  

- 情景图  
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/factory/%E6%8A%BD%E8%B1%A1%E6%83%85%E6%99%AF.jpg?raw=true)

- UML  
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/factory/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82.jpg?raw=true)
  
5. 单例
- 一句话说明  
确保一个类只有一个实例，并提供一个全局的访问点。

[单例模式是代码实现https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/singleton](https://github.com/floor07/DesignParttern-Demo/tree/master/src/main/java/singleton)

6. 命令模式
- 一句话说明
将请求封装成对象，以便使用不同的请求、队列或参数化其他对象。命令模式也支持可撤销的操作。

- 情景图  
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/command/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F%E6%83%85%E6%99%AF%E5%9B%BE.jpg?raw=true)

- UML  
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/command/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F.jpg?raw=true)



7. 适配模式

- 一句话说明
将一个类的接口，转换为客户期望的另一个类的接口。

- 情景图

![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/adapter/%E9%80%82%E9%85%8D%E5%99%A8%E6%83%85%E6%99%AF%E5%9B%BE.jpg?raw=true)

- UML图 
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/adapter/%E9%80%82%E9%85%8D%E5%99%A8.jpg?raw=true)



8. 模板模式  
- 一句话说明  
在一个方法中定义一个算法的骨架，而将一些步骤延迟子类。  
- UML  
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/template/%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95.jpg?raw=true)



9. 迭代器

- 一句话说明
提供一种方法，顺序的访问一个聚合对象中的各元素，而不暴露其内部表示。

- UML
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/iterator/%E8%BF%AD%E4%BB%A3%E5%99%A8.jpg?raw=true)  


10. 组合  
- 一句话说明  
允许你将对象组合成树形结构来表现“整体/部分”的层次结  

- 情景图    
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/component/%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F%E6%83%85%E6%99%AF.jpg?raw=true)

- UML  
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/component/%E7%BB%84%E5%90%88.jpg?raw=true)

11. 状态模式
- 一句话说明
允许对象在内部状态改变是改变他的行为，对象看起来好像修改了他的类。  

- UML
![image](https://github.com/floor07/DesignParttern-Demo/blob/master/image/state/%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F.jpg?raw=true)




# 相关blog：  

[开源中国blog面向对象4原则](https://my.oschina.net/floor/blog/890899)



