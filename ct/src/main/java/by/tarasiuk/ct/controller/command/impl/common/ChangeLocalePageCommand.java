package by.tarasiuk.ct.controller.command.impl.common;

import by.tarasiuk.ct.controller.RequestContent;
import by.tarasiuk.ct.controller.command.Command;
import by.tarasiuk.ct.controller.command.PagePath;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Map;

import static by.tarasiuk.ct.controller.command.AttributeName.LOCALE;

/**
 * Change locale command for pages
 */
public class ChangeLocalePageCommand implements Command {
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * The locale is changed to the one selected on the page by the user.
     * @param content - RequestContent
     * @return main page
     */
    @Override
    public String execute(RequestContent content) {
        Map<String, Object> sessionAttributes = content.getSessionAttributes();
        Map<String, String> requestParameters = content.getRequestParameters();

        String oldLocale = (String) sessionAttributes.get(LOCALE);
        String newLocale = requestParameters.get(LOCALE);

        content.putSessionAttribute(LOCALE, newLocale);

        LOGGER.info("Locale page change from '{}' to '{}'.", oldLocale, newLocale);
        return PagePath.MAIN;   //todo как получить адрес страницы, из которой пришёл юзер? Чтобы перенаправить его пять туда же.
    }
}
