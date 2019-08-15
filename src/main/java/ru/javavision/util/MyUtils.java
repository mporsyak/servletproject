package ru.javavision.util;

import javax.servlet.ServletRequest;
import java.sql.Connection;

/**
 * Created by Михаил on 01.06.2019.
 */
public class MyUtils {
}

//    DBUtils dbUtils = new DBUtils();
//
//    public DBUtils getDbUtils() {
//        return dbUtils;
//    }
//}
//    public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";
//
//    private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKIE";
//
//    // Сохранить Connection в attribute в request.
//    // Данная информация хранения существует только во время запроса (request)
//    // до тех пор, пока данные возвращаются приложению пользователя.
//    public static void storeConnection(ServletRequest req, Connection connection) {
//        req.setAttribute(ATT_NAME_CONNECTION, connection);
//    }
//
//    // Получить объект Connection сохраненный в attribute в request.
//    public static Connection getConnection(ServletRequest req) {
//        Connection connection = (Connection) req.getAttribute(ATT_NAME_CONNECTION);
//
//        return  connection;
//    }
//}
