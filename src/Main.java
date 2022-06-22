public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {


        try {
            UserInfo.authorise("ef", "a12_3", "s");

        }
        catch (WrongLoginException exception) {
            exception.printStackTrace();
        }
        catch (WrongPasswordException exception) {
            exception.printStackTrace();

        }
        finally {
            System.out.println("Проверка завершена");
        }
    }
}
