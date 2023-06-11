import java.awt.Window;

public class TutupForm {
    public static void closeForm(Class<?> formClass) {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (formClass.isInstance(window)) {
                window.dispose();
            }
        }
    }
}