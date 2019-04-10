package abstract_factory;
/*
*背景：小成有两间塑料加工厂（A厂仅生产容器类产品；B厂仅生产模具类产品）；随着客户需求的变化，A厂所在地的客户需要也模具类产品，B厂所在地的客户也需要容器类产品；
冲突：没有资源（资金+租位）在当地分别开设多一家注塑分厂
解决方案：在原有的两家塑料厂里增设生产需求的功能，即A厂能生产容器+模具产品；B厂间能生产模具+容器产品。


* 步骤1： 创建抽象工厂类，定义具体工厂的公共接口；
步骤2： 创建抽象产品族类 ，定义抽象产品的公共接口；
步骤3： 创建抽象产品类 （继承抽象产品族类），定义具体产品的公共接口；
步骤4： 创建具体产品类（继承抽象产品类） & 定义生产的具体产品；
步骤5：创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
步骤6：客户端通过实例化具体的工厂类，并调用其创建不同目标产品的方法创建不同具体产品类的实例

* */
public class Demo {

    //步骤1： 创建抽象工厂类
    abstract class Factory{
        public abstract AbstractProduct ManufactureContainer();
        public abstract AbstractProduct ManufactureMould();
    }

    //步骤2： 创建抽象产品族类
    abstract class AbstractProduct{
        public abstract void Show();
    }

    //步骤3： 创建抽象产品类
    //容器产品抽象类
    abstract class ContainerProduct extends AbstractProduct{
        @Override
        public abstract void Show();
    }

    //模具产品抽象类
    abstract class MouldProduct extends AbstractProduct{
        @Override
        public abstract void Show();
    }

    //步骤4： 创建具体产品类（继承抽象产品类）
    //容器产品A类
    class ContainerProductA extends ContainerProduct{
        @Override
        public void Show() {
            System.out.println("工厂A生产出了容器产品A");
        }
    }

    //容器产品B类
    class ContainerProductB extends ContainerProduct{
        @Override
        public void Show() {
            System.out.println("工厂B生产出了容器产品B");
        }
    }

    //模具产品A类
    class MouldProductA extends MouldProduct{

        @Override
        public void Show() {
            System.out.println("工厂A生产出了模具产品A");
        }
    }

    //模具产品B类
    class MouldProductB extends MouldProduct{

        @Override
        public void Show() {
            System.out.println("工厂B生产出了模具产品B");
        }
    }

    //步骤5：创建具体工厂类（继承抽象工厂类）
    //A厂 - 生产模具+容器产品
    class FactoryA extends Factory{

        @Override
        public AbstractProduct ManufactureContainer() {
            return new ContainerProductA();
        }

        @Override
        public AbstractProduct ManufactureMould() {
            return new MouldProductA();
        }
    }

    //B厂 - 生产模具+容器产品
    class FactoryB extends Factory{

        @Override
        public AbstractProduct ManufactureContainer() {
            return new ContainerProductB();
        }

        @Override
        public AbstractProduct ManufactureMould() {
            return new MouldProductB();
        }
    }

    //测试
    public static void main(String[] args){
        FactoryA mFactoryA = new Demo().new FactoryA();
        FactoryB mFactoryB =new Demo(). new FactoryB();
        //A厂当地客户需要容器产品A
        mFactoryA.ManufactureContainer().Show();
        //A厂当地客户需要模具产品A
        mFactoryA.ManufactureMould().Show();

        //B厂当地客户需要容器产品B
        mFactoryB.ManufactureContainer().Show();
        //B厂当地客户需要模具产品B
        mFactoryB.ManufactureMould().Show();

    }
}
