package games.rednblack.h2d.common.view;

import com.kotcrab.vis.ui.widget.VisTable;
import org.puremvc.java.interfaces.IFacade;

public abstract class SettingsNodeValue<T> {
    private final VisTable contentTable = new VisTable();
    private T settings;
    private final String name;
    protected IFacade facade;

    public SettingsNodeValue(String name, IFacade facade) {
        this.name = name;
        contentTable.top().left();
        this.facade = facade;
    }

    public abstract void translateSettingsToView();
    public abstract void translateViewToSettings();
    public abstract boolean validateSettings();

    public VisTable getContentTable() {
        return contentTable;
    }
    public String getName() {
        return name;
    }

    public void setSettings(T settings) {
        this.settings = settings;
    }

    public T getSettings() {
        return settings;
    }
}