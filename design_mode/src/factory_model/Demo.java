package factory_model;

/*
* 背景：小成有一间塑料加工厂（仅生产A类产品）；随着客户需求的变化，客户需要生产B类产品；
冲突：改变原有塑料加工厂的配置和变化非常困难，假设下一次客户需要再发生变化，再次改变将增大非常大的成本；
解决方案：小成决定置办塑料分厂B来生产B类产品；
* */

/*
* 步骤1： 创建抽象工厂类，定义具体工厂的公共接口；
步骤2： 创建抽象产品类 ，定义具体产品的公共接口；
步骤3： 创建具体产品类（继承抽象产品类） & 定义生产的具体产品；
步骤4：创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
步骤5：外界通过调用具体工厂类的方法，从而创建不同具体产品类的实例

* */
public class Demo {

    //1.创建抽象工厂类，定义具体工厂的公共接口
    abstract class Factory{
        public abstract Product Manufacture();
    }

   //2.创建抽象产品类 ，定义具体产品的公共接口；
    abstract class Product{
        public abstract void Show();
    }

    //3.创建具体产品
    //具体产品A类
    class  ProductA extends  Product{
        @Override
        public void Show() {
            System.out.println("生产出了产品A");
        }
    }

    //具体产品B类
    class  ProductB extends  Product{

        @Override
        public void Show() {
            System.out.println("生产出了产品B");
        }
    }

    //4.创建具体工厂
    //工厂A类 - 生产A类产品
    class  FactoryA extends Factory{
        @Override
        public Product Manufacture() {
            return new ProductA();
        }
    }

    //工厂B类 - 生产B类产品
    class  FactoryB extends Factory{
        @Override
        public Product Manufacture() {
            return new ProductB();
        }
    }


    //测试
    public static void main(String[] args){
        //客户要产品A
        FactoryA mFactoryA = new Demo().new FactoryA();
        mFactoryA.Manufacture().Show();

        //客户要产品B
        FactoryB mFactoryB = new Demo(). new FactoryB();
        mFactoryB.Manufacture().Show();
    }
}
