package lesson1.part1;

public class Lessons {
	// ---Attributes
	private int numberOfLessons;
	private String lessonName;
	private int lessonDuration;

	// ----Methods
	// This is getter
	public int getNumberOfLessons() {
		return numberOfLessons;
	}
	public String getLessonName() {
		return lessonName;
	}
	public int getlessonDuration() {
		return lessonDuration;
	}
	// This is setter
	public void setNumberOfLessons(int newNumberOfLessons) {
		numberOfLessons = newNumberOfLessons;
	}
	public void setLessonName(String newLessonName) {
		lessonName = newLessonName;
	}
	public void setLessonDuration(int newLessonDuration) {
		lessonDuration = newLessonDuration;
	}

	// ----Create class instances
	public static void main(String[] args) {
     Lessons englishLessons=new Lessons ();
     Lessons programmingLessons=new Lessons ();
     Lessons dancingLessons=new Lessons ();
     englishLessons.setLessonName("English Lessons");
     programmingLessons.setLessonName("Programing Lessons");
     dancingLessons.setLessonName("Dancing Lessons");
     
     englishLessons.setLessonDuration(45);
     programmingLessons.setLessonDuration(90);
     dancingLessons.setLessonDuration(120);
     
     
     System.out.println("Hello, my name is Alla");
     
     System.out.println("I am attending "+programmingLessons.getLessonName());
     
     System.out.println("Length of our lesson is "+programmingLessons.getlessonDuration()+" minutes");
	}

}
