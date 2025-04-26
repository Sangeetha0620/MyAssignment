package week3.day2;


	public class Elements extends Button {
        public static void main(String[] args) {
            // WebElement reference
            WebElement element = new WebElement();
            element.click();
            element.setText("Base element");

            // Button
            Button button = new Button();
            button.click();
            button.setText("Submit button");
            button.submit();

            // TextField
            TextField textField = new TextField();
            textField.click();
            textField.setText("Username");
            System.out.println(textField.getText());

            // CheckBoxButton
            CheckBoxButton checkBox = new CheckBoxButton();
            checkBox.click();
            checkBox.setText("Check this");
            checkBox.submit();
            checkBox.clickCheckButton();

            // RadioButton
            RadioButton radio = new RadioButton();
            radio.click();
            radio.setText("Option 1");
            radio.submit();
            radio.selectRadioButton();

            // Elements class (inherits from Button)
            Elements exec = new Elements();
            exec.click();
            exec.setText("Executing button");
            exec.submit();
        }
	}

