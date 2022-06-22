public class UserInfo {


    public static void authorise(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        char[] chars = login.toCharArray();
        for (char c: chars) {

            if (c >= '0' && c <= '9') continue;
            if (c >= 'A' && c <= 'Z') continue;
            if (c >= 'a' && c <= 'z') continue;
            if (c == '_') continue;
            else {
                throw new WrongLoginException("Логин содержит неверные символы");
            }

        }

        if (login.length() > 20) {
            throw new WrongLoginException("Логин не должен превышать 20 символов");
        }
        if (login.length() < 1) {
            throw new WrongLoginException("Логин не введен");
        }

        char[] chars2 = password.toCharArray();
        for (char b: chars2) {

            if (b >= '0' && b <= '9') continue;
            if (b >= 'A' && b <= 'Z') continue;
            if (b >= 'a' && b <= 'z') continue;
            if (b == '_') continue;
            else {
                throw new WrongPasswordException("Пароль содержит неверные символы");
            }
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не должен превышать 20 символов");
        }
        else if (password.length() < 1) {
            throw new WrongPasswordException("Пароль не введен");
        } else if (confirmPassword != password) {
            throw new WrongPasswordException ("Пароль не совпадает с подтверждением");
        }

        else {
            System.out.println("welcome");
        }

    }


}
