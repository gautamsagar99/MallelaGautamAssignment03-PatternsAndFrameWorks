package questions;

public class Question26 {
	private static Question26 instance;

    private  Question26() {
		// TODO Auto-generated constructor stub
	}

    public static  Question26 getInstance() {
        if (instance == null) {
            instance = new Question26();
        }
        return instance;
    }


}
