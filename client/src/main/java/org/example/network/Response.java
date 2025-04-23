package org.example.network;

import java.io.Serial;
import java.io.Serializable;

/**
 * Класс, представляющий ответ от сервера.
 * Используется для передачи результата выполнения команды и информации об ошибках входа.
 */
public class Response implements Serializable {

    /** Сериализационный идентификатор для обеспечения совместимости при передаче объектов */
    @Serial
    private static final long serialVersionUID = 20L;

    /** Поле, указывающее на наличие ошибки при входе в систему */
    private LoginError loginError;

    /** Результат выполнения команды, по умолчанию — "Успешно" */
    private String result = "Успешно";

    /**
     * Устанавливает текст результата ответа.
     *
     * @param result строка с сообщением результата
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Возвращает текст результата выполнения команды.
     *
     * @return строка с сообщением результата
     */
    public String getResult() {
        return result;
    }

    /**
     * Конструктор для создания объекта ответа.
     *
     * @param loginError тип ошибки входа (если есть)
     * @param result результат выполнения команды
     */
    public Response(LoginError loginError, String result) {
        this.result = result;
        this.loginError = loginError;
    }

    /**
     * Возвращает информацию об ошибке входа.
     *
     * @return перечисление типа LoginError
     */
    public LoginError getLoginError() {
        return loginError;
    }
}
