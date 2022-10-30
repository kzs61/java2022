package w03_task_1;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {
    
	@Override
    public void calculate() {
        System.out.println("Military customer credit calculated");
    }

}