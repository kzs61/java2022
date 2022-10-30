package w3_task_1;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    
	@Override
    public void calculate() {
        System.out.println("Teacher's credit calculated");
    }

    @Override
    public void save() {
        super.save();
    }
}