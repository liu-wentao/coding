package builder_pattern;

public class ConcreteBuilder extends Builder {

    //创建产品实例
    Computer computer = new Computer();

    //组装产品
    @Override
    public void  buildCPU(){
        computer.add("组装CPU");
    }

    @Override
    public void  buildMainboard(){
        computer.add("组装主板");
    }

    @Override
    public void  buildHD(){
        computer.add("组装主板");
    }

    //返回组装成功的电脑
    @Override
    public  Computer getComputer(){
        return computer;
    }


}
