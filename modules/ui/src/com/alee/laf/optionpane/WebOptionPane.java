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

package com.alee.laf.optionpane;

import com.alee.extended.painter.Painter;
import com.alee.laf.WebLookAndFeel;
import com.alee.managers.log.Log;
import com.alee.managers.style.*;
import com.alee.utils.ReflectUtils;

import javax.swing.*;
import java.awt.*;

/**
 * This JOptionPane extension class provides a direct access to WebOptionPaneUI methods.
 *
 * @author Mikle Garin
 */

public class WebOptionPane extends JOptionPane implements Styleable, ShapeProvider, MarginSupport, PaddingSupport
{
    /**
     * Constructs new option pane.
     */
    public WebOptionPane ()
    {
        super ();
    }

    /**
     * Constructs new option pane.
     *
     * @param message message
     */
    public WebOptionPane ( final Object message )
    {
        super ( message );
    }

    /**
     * Constructs new option pane.
     *
     * @param message     message
     * @param messageType message type
     */
    public WebOptionPane ( final Object message, final int messageType )
    {
        super ( message, messageType );
    }

    /**
     * Constructs new option pane.
     *
     * @param message     message
     * @param messageType message type
     * @param optionType  option pane type
     */
    public WebOptionPane ( final Object message, final int messageType, final int optionType )
    {
        super ( message, messageType, optionType );
    }

    /**
     * Constructs new option pane.
     *
     * @param message     message
     * @param messageType message type
     * @param optionType  option pane type
     * @param icon        option pane icon
     */
    public WebOptionPane ( final Object message, final int messageType, final int optionType, final Icon icon )
    {
        super ( message, messageType, optionType, icon );
    }

    /**
     * Constructs new option pane.
     *
     * @param message     message
     * @param messageType message type
     * @param optionType  option pane type
     * @param icon        option pane icon
     * @param options     available options
     */
    public WebOptionPane ( final Object message, final int messageType, final int optionType, final Icon icon, final Object[] options )
    {
        super ( message, messageType, optionType, icon, options );
    }

    /**
     * Constructs new option pane.
     *
     * @param message      message
     * @param messageType  message type
     * @param optionType   option pane type
     * @param icon         option pane icon
     * @param options      available options
     * @param initialValue initial value
     */
    public WebOptionPane ( final Object message, final int messageType, final int optionType, final Icon icon, final Object[] options,
                           final Object initialValue )
    {
        super ( message, messageType, optionType, icon, options, initialValue );
    }

    /**
     * Constructs new option pane.
     *
     * @param id style ID
     */
    public WebOptionPane ( final StyleId id )
    {
        super ();
        setStyleId ( id );
    }

    /**
     * Constructs new option pane.
     *
     * @param id      style ID
     * @param message message
     */
    public WebOptionPane ( final StyleId id, final Object message )
    {
        super ( message );
        setStyleId ( id );
    }

    /**
     * Constructs new option pane.
     *
     * @param id          style ID
     * @param message     message
     * @param messageType message type
     */
    public WebOptionPane ( final StyleId id, final Object message, final int messageType )
    {
        super ( message, messageType );
        setStyleId ( id );
    }

    /**
     * Constructs new option pane.
     *
     * @param id          style ID
     * @param message     message
     * @param messageType message type
     * @param optionType  option pane type
     */
    public WebOptionPane ( final StyleId id, final Object message, final int messageType, final int optionType )
    {
        super ( message, messageType, optionType );
        setStyleId ( id );
    }

    /**
     * Constructs new option pane.
     *
     * @param id          style ID
     * @param message     message
     * @param messageType message type
     * @param optionType  option pane type
     * @param icon        option pane icon
     */
    public WebOptionPane ( final StyleId id, final Object message, final int messageType, final int optionType, final Icon icon )
    {
        super ( message, messageType, optionType, icon );
        setStyleId ( id );
    }

    /**
     * Constructs new option pane.
     *
     * @param id          style ID
     * @param message     message
     * @param messageType message type
     * @param optionType  option pane type
     * @param icon        option pane icon
     * @param options     available options
     */
    public WebOptionPane ( final StyleId id, final Object message, final int messageType, final int optionType, final Icon icon,
                           final Object[] options )
    {
        super ( message, messageType, optionType, icon, options );
        setStyleId ( id );
    }

    /**
     * Constructs new option pane.
     *
     * @param id           style ID
     * @param message      message
     * @param messageType  message type
     * @param optionType   option pane type
     * @param icon         option pane icon
     * @param options      available options
     * @param initialValue initial value
     */
    public WebOptionPane ( final StyleId id, final Object message, final int messageType, final int optionType, final Icon icon,
                           final Object[] options, final Object initialValue )
    {
        super ( message, messageType, optionType, icon, options, initialValue );
        setStyleId ( id );
    }

    /**
     * Returns text field painter.
     *
     * @return text field painter
     */
    public Painter getPainter ()
    {
        return getWebUI ().getPainter ();
    }

    /**
     * Sets text field painter.
     * Pass null to remove text field painter.
     *
     * @param painter new text field painter
     * @return this text field
     */
    public WebOptionPane setPainter ( final Painter painter )
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

    @Override
    public Insets getMargin ()
    {
        return getWebUI ().getMargin ();
    }

    /**
     * Sets new margin.
     *
     * @param margin new margin
     */
    public void setMargin ( final int margin )
    {
        setMargin ( margin, margin, margin, margin );
    }

    /**
     * Sets new margin.
     *
     * @param top    new top margin
     * @param left   new left margin
     * @param bottom new bottom margin
     * @param right  new right margin
     */
    public void setMargin ( final int top, final int left, final int bottom, final int right )
    {
        setMargin ( new Insets ( top, left, bottom, right ) );
    }

    @Override
    public void setMargin ( final Insets margin )
    {
        getWebUI ().setMargin ( margin );
    }

    @Override
    public Insets getPadding ()
    {
        return getWebUI ().getPadding ();
    }

    /**
     * Sets new padding.
     *
     * @param padding new padding
     */
    public void setPadding ( final int padding )
    {
        setPadding ( padding, padding, padding, padding );
    }

    /**
     * Sets new padding.
     *
     * @param top    new top padding
     * @param left   new left padding
     * @param bottom new bottom padding
     * @param right  new right padding
     */
    public void setPadding ( final int top, final int left, final int bottom, final int right )
    {
        setPadding ( new Insets ( top, left, bottom, right ) );
    }

    @Override
    public void setPadding ( final Insets padding )
    {
        getWebUI ().setPadding ( padding );
    }

    /**
     * Returns Web-UI applied to this class.
     *
     * @return Web-UI applied to this class
     */
    private WebOptionPaneUI getWebUI ()
    {
        return ( WebOptionPaneUI ) getUI ();
    }

    /**
     * Installs a Web-UI into this component.
     */
    @Override
    public void updateUI ()
    {
        if ( getUI () == null || !( getUI () instanceof WebOptionPaneUI ) )
        {
            try
            {
                setUI ( ( WebOptionPaneUI ) ReflectUtils.createInstance ( WebLookAndFeel.optionPaneUI ) );
            }
            catch ( final Throwable e )
            {
                Log.error ( this, e );
                setUI ( new WebOptionPaneUI () );
            }
        }
        else
        {
            setUI ( getUI () );
        }
    }
}