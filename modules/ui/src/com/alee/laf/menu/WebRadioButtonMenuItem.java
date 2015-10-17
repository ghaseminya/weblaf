/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.laf.menu;

import com.alee.extended.painter.Painter;
import com.alee.laf.WebLookAndFeel;
import com.alee.managers.hotkey.HotkeyData;
import com.alee.managers.language.LanguageManager;
import com.alee.managers.language.LanguageMethods;
import com.alee.managers.language.updaters.LanguageUpdater;
import com.alee.managers.log.Log;
import com.alee.managers.settings.DefaultValue;
import com.alee.managers.settings.SettingsManager;
import com.alee.managers.settings.SettingsMethods;
import com.alee.managers.settings.SettingsProcessor;
import com.alee.managers.style.StyleId;
import com.alee.utils.ReflectUtils;
import com.alee.utils.SwingUtils;
import com.alee.managers.style.ShapeProvider;
import com.alee.managers.style.Styleable;
import com.alee.utils.swing.FontMethods;

import javax.swing.*;
import java.awt.*;

/**
 * This JRadioButtonMenuItem extension class provides a direct access to WebRadioButtonMenuItemUI methods.
 *
 * @author Mikle Garin
 */

public class WebRadioButtonMenuItem extends JRadioButtonMenuItem
        implements Styleable, ShapeProvider, LanguageMethods, SettingsMethods, FontMethods<WebRadioButtonMenuItem>
{
    /**
     * Constructs new radiobutton menu item.
     */
    public WebRadioButtonMenuItem ()
    {
        super ();
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param a menu item action
     */
    public WebRadioButtonMenuItem ( final Action a )
    {
        super ( a );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param icon menu item icon
     */
    public WebRadioButtonMenuItem ( final Icon icon )
    {
        super ( icon );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param icon     menu item icon
     * @param selected whether this radiobutton item is selected or not
     */
    public WebRadioButtonMenuItem ( final Icon icon, final boolean selected )
    {
        super ( icon, selected );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text menu item text
     */
    public WebRadioButtonMenuItem ( final String text )
    {
        super ( text );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text        menu item text
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final String text, final KeyStroke accelerator )
    {
        super ( text );
        setAccelerator ( accelerator );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text        menu item text
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final String text, final HotkeyData accelerator )
    {
        super ( text );
        setAccelerator ( accelerator );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text menu item text
     * @param icon menu item icon
     */
    public WebRadioButtonMenuItem ( final String text, final Icon icon )
    {
        super ( text, icon );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text     menu item text
     * @param icon     menu item icon
     * @param selected whether this radiobutton item is selected or not
     */
    public WebRadioButtonMenuItem ( final String text, final Icon icon, final boolean selected )
    {
        super ( text, icon, selected );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text     menu item text
     * @param selected whether this radiobutton item is selected or not
     */
    public WebRadioButtonMenuItem ( final String text, final boolean selected )
    {
        super ( text, selected );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text        menu item text
     * @param icon        menu item icon
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final String text, final Icon icon, final KeyStroke accelerator )
    {
        super ( text, icon );
        setAccelerator ( accelerator );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text        menu item text
     * @param icon        menu item icon
     * @param b           whether this checkbox item is selected or not
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final String text, final Icon icon, final boolean b, final KeyStroke accelerator )
    {
        super ( text, icon, b );
        setAccelerator ( accelerator );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text        menu item text
     * @param icon        menu item icon
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final String text, final Icon icon, final HotkeyData accelerator )
    {
        super ( text, icon );
        setAccelerator ( accelerator );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param text        menu item text
     * @param icon        menu item icon
     * @param b           whether this checkbox item is selected or not
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final String text, final Icon icon, final boolean b, final HotkeyData accelerator )
    {
        super ( text, icon, b );
        setAccelerator ( accelerator );
    }

    /**
     * Constructs new radiobutton menu item.
     *
     * @param id style ID
     */
    public WebRadioButtonMenuItem ( final StyleId id )
    {
        super ();
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id style ID
     * @param a  menu item action
     */
    public WebRadioButtonMenuItem ( final StyleId id, final Action a )
    {
        super ( a );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id   style ID
     * @param icon menu item icon
     */
    public WebRadioButtonMenuItem ( final StyleId id, final Icon icon )
    {
        super ( icon );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id       style ID
     * @param icon     menu item icon
     * @param selected whether this radiobutton item is selected or not
     */
    public WebRadioButtonMenuItem ( final StyleId id, final Icon icon, final boolean selected )
    {
        super ( icon, selected );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id   style ID
     * @param text menu item text
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text )
    {
        super ( text );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id          style ID
     * @param text        menu item text
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final KeyStroke accelerator )
    {
        super ( text );
        setAccelerator ( accelerator );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id          style ID
     * @param text        menu item text
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final HotkeyData accelerator )
    {
        super ( text );
        setAccelerator ( accelerator );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id   style ID
     * @param text menu item text
     * @param icon menu item icon
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final Icon icon )
    {
        super ( text, icon );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id       style ID
     * @param text     menu item text
     * @param icon     menu item icon
     * @param selected whether this radiobutton item is selected or not
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final Icon icon, final boolean selected )
    {
        super ( text, icon, selected );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id       style ID
     * @param text     menu item text
     * @param selected whether this radiobutton item is selected or not
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final boolean selected )
    {
        super ( text, selected );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id          style ID
     * @param text        menu item text
     * @param icon        menu item icon
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final Icon icon, final KeyStroke accelerator )
    {
        super ( text, icon );
        setAccelerator ( accelerator );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id          style ID
     * @param text        menu item text
     * @param icon        menu item icon
     * @param b           whether this checkbox item is selected or not
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final Icon icon, final boolean b, final KeyStroke accelerator )
    {
        super ( text, icon, b );
        setAccelerator ( accelerator );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id          style ID
     * @param text        menu item text
     * @param icon        menu item icon
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final Icon icon, final HotkeyData accelerator )
    {
        super ( text, icon );
        setAccelerator ( accelerator );
        setStyleId ( id );
    }

    /**
     * Constructs new radiobutton menu item using the specified settings.
     *
     * @param id          style ID
     * @param text        menu item text
     * @param icon        menu item icon
     * @param b           whether this checkbox item is selected or not
     * @param accelerator menu item accelerator
     */
    public WebRadioButtonMenuItem ( final StyleId id, final String text, final Icon icon, final boolean b, final HotkeyData accelerator )
    {
        super ( text, icon, b );
        setAccelerator ( accelerator );
        setStyleId ( id );
    }

    /**
     * Sets the key combination which invokes the menu item's action listeners without navigating the menu hierarchy.
     *
     * @param hotkey hotkey data
     */
    public void setAccelerator ( final HotkeyData hotkey )
    {
        SwingUtils.setAccelerator ( this, hotkey );
    }

    /**
     * Returns menu item painter.
     *
     * @return menu item painter
     */
    public Painter getPainter ()
    {
        return getWebUI ().getPainter ();
    }

    /**
     * Sets menu item painter.
     * Pass null to remove menu item painter.
     *
     * @param painter new menu item painter
     * @return this menu item
     */
    public WebRadioButtonMenuItem setPainter ( final Painter painter )
    {
        getWebUI ().setPainter ( painter );
        return this;
    }

    @Override
    public StyleId getStyleId ()
    {
        return getWebUI ().getStyleId ();
    }

    @Override
    public StyleId setStyleId ( final StyleId id )
    {
        return getWebUI ().setStyleId ( id );
    }

    @Override
    public Shape provideShape ()
    {
        return getWebUI ().provideShape ();
    }

    /**
     * Returns Web-UI applied to this class.
     *
     * @return Web-UI applied to this class
     */
    public WebRadioButtonMenuItemUI getWebUI ()
    {
        return ( WebRadioButtonMenuItemUI ) getUI ();
    }

    /**
     * Installs a Web-UI into this component.
     */
    @Override
    public void updateUI ()
    {
        if ( getUI () == null || !( getUI () instanceof WebRadioButtonMenuItemUI ) )
        {
            try
            {
                setUI ( ( WebRadioButtonMenuItemUI ) ReflectUtils.createInstance ( WebLookAndFeel.radioButtonMenuItemUI ) );
            }
            catch ( final Throwable e )
            {
                Log.error ( this, e );
                setUI ( new WebRadioButtonMenuItemUI () );
            }
        }
        else
        {
            setUI ( getUI () );
        }
    }

    @Override
    public void setLanguage ( final String key, final Object... data )
    {
        LanguageManager.registerComponent ( this, key, data );
    }

    @Override
    public void updateLanguage ( final Object... data )
    {
        LanguageManager.updateComponent ( this, data );
    }

    @Override
    public void updateLanguage ( final String key, final Object... data )
    {
        LanguageManager.updateComponent ( this, key, data );
    }

    @Override
    public void removeLanguage ()
    {
        LanguageManager.unregisterComponent ( this );
    }

    @Override
    public boolean isLanguageSet ()
    {
        return LanguageManager.isRegisteredComponent ( this );
    }

    @Override
    public void setLanguageUpdater ( final LanguageUpdater updater )
    {
        LanguageManager.registerLanguageUpdater ( this, updater );
    }

    @Override
    public void removeLanguageUpdater ()
    {
        LanguageManager.unregisterLanguageUpdater ( this );
    }

    @Override
    public void registerSettings ( final String key )
    {
        SettingsManager.registerComponent ( this, key );
    }

    @Override
    public <T extends DefaultValue> void registerSettings ( final String key, final Class<T> defaultValueClass )
    {
        SettingsManager.registerComponent ( this, key, defaultValueClass );
    }

    @Override
    public void registerSettings ( final String key, final Object defaultValue )
    {
        SettingsManager.registerComponent ( this, key, defaultValue );
    }

    @Override
    public void registerSettings ( final String group, final String key )
    {
        SettingsManager.registerComponent ( this, group, key );
    }

    @Override
    public <T extends DefaultValue> void registerSettings ( final String group, final String key, final Class<T> defaultValueClass )
    {
        SettingsManager.registerComponent ( this, group, key, defaultValueClass );
    }

    @Override
    public void registerSettings ( final String group, final String key, final Object defaultValue )
    {
        SettingsManager.registerComponent ( this, group, key, defaultValue );
    }

    @Override
    public void registerSettings ( final String key, final boolean loadInitialSettings, final boolean applySettingsChanges )
    {
        SettingsManager.registerComponent ( this, key, loadInitialSettings, applySettingsChanges );
    }

    @Override
    public <T extends DefaultValue> void registerSettings ( final String key, final Class<T> defaultValueClass,
                                                            final boolean loadInitialSettings, final boolean applySettingsChanges )
    {
        SettingsManager.registerComponent ( this, key, defaultValueClass, loadInitialSettings, applySettingsChanges );
    }

    @Override
    public void registerSettings ( final String key, final Object defaultValue, final boolean loadInitialSettings,
                                   final boolean applySettingsChanges )
    {
        SettingsManager.registerComponent ( this, key, defaultValue, loadInitialSettings, applySettingsChanges );
    }

    @Override
    public <T extends DefaultValue> void registerSettings ( final String group, final String key, final Class<T> defaultValueClass,
                                                            final boolean loadInitialSettings, final boolean applySettingsChanges )
    {
        SettingsManager.registerComponent ( this, group, key, defaultValueClass, loadInitialSettings, applySettingsChanges );
    }

    @Override
    public void registerSettings ( final String group, final String key, final Object defaultValue, final boolean loadInitialSettings,
                                   final boolean applySettingsChanges )
    {
        SettingsManager.registerComponent ( this, group, key, defaultValue, loadInitialSettings, applySettingsChanges );
    }

    @Override
    public void registerSettings ( final SettingsProcessor settingsProcessor )
    {
        SettingsManager.registerComponent ( this, settingsProcessor );
    }

    @Override
    public void unregisterSettings ()
    {
        SettingsManager.unregisterComponent ( this );
    }

    @Override
    public void loadSettings ()
    {
        SettingsManager.loadComponentSettings ( this );
    }

    @Override
    public void saveSettings ()
    {
        SettingsManager.saveComponentSettings ( this );
    }

    @Override
    public WebRadioButtonMenuItem setPlainFont ()
    {
        return SwingUtils.setPlainFont ( this );
    }

    @Override
    public WebRadioButtonMenuItem setPlainFont ( final boolean apply )
    {
        return SwingUtils.setPlainFont ( this, apply );
    }

    @Override
    public boolean isPlainFont ()
    {
        return SwingUtils.isPlainFont ( this );
    }

    @Override
    public WebRadioButtonMenuItem setBoldFont ()
    {
        return SwingUtils.setBoldFont ( this );
    }

    @Override
    public WebRadioButtonMenuItem setBoldFont ( final boolean apply )
    {
        return SwingUtils.setBoldFont ( this, apply );
    }

    @Override
    public boolean isBoldFont ()
    {
        return SwingUtils.isBoldFont ( this );
    }

    @Override
    public WebRadioButtonMenuItem setItalicFont ()
    {
        return SwingUtils.setItalicFont ( this );
    }

    @Override
    public WebRadioButtonMenuItem setItalicFont ( final boolean apply )
    {
        return SwingUtils.setItalicFont ( this, apply );
    }

    @Override
    public boolean isItalicFont ()
    {
        return SwingUtils.isItalicFont ( this );
    }

    @Override
    public WebRadioButtonMenuItem setFontStyle ( final boolean bold, final boolean italic )
    {
        return SwingUtils.setFontStyle ( this, bold, italic );
    }

    @Override
    public WebRadioButtonMenuItem setFontStyle ( final int style )
    {
        return SwingUtils.setFontStyle ( this, style );
    }

    @Override
    public WebRadioButtonMenuItem setFontSize ( final int fontSize )
    {
        return SwingUtils.setFontSize ( this, fontSize );
    }

    @Override
    public WebRadioButtonMenuItem changeFontSize ( final int change )
    {
        return SwingUtils.changeFontSize ( this, change );
    }

    @Override
    public int getFontSize ()
    {
        return SwingUtils.getFontSize ( this );
    }

    @Override
    public WebRadioButtonMenuItem setFontSizeAndStyle ( final int fontSize, final boolean bold, final boolean italic )
    {
        return SwingUtils.setFontSizeAndStyle ( this, fontSize, bold, italic );
    }

    @Override
    public WebRadioButtonMenuItem setFontSizeAndStyle ( final int fontSize, final int style )
    {
        return SwingUtils.setFontSizeAndStyle ( this, fontSize, style );
    }

    @Override
    public WebRadioButtonMenuItem setFontName ( final String fontName )
    {
        return SwingUtils.setFontName ( this, fontName );
    }

    @Override
    public String getFontName ()
    {
        return SwingUtils.getFontName ( this );
    }
}