/*
 JSlidingInfo v0.1
 -------------------------------------
 a sliding info component for java.
 -------------------------------------
 Developed By : deepak pk
 Email : deepakpk009@yahoo.in
 -------------------------------------
 This Project is Licensed under LGPL
 -------------------------------------
 
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.deepak.jslidinginfo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.LineBorder;

/**
 * @author deepak pk <deepakpk009@yahoo.in>
 * @version 0.1
 * @since 2013-02-28
 */
public class JSlidingInfo {

    /**
     * the screen left top position
     */
    public static final int POSITION_LEFT_TOP = 0;
    /**
     * the screen right top position
     */
    public static final int POSITION_RIGHT_TOP = 1;
    /**
     * the screen left bottom position
     */
    public static final int POSITION_LEFT_BOTTOM = 2;
    /**
     * the screen right bottom position
     */
    public static final int POSITION_RIGHT_BOTTOM = 3;
    /**
     * the screen left vertical center position
     */
    public static final int POSITION_LEFT_VCENTRE = 4;
    /**
     * the screen right vertical center position
     */
    public static final int POSITION_RIGHT_VCENTRE = 5;
    /**
     * the screen top horizontal center position
     */
    public static final int POSITION_TOP_HCENTRE = 6;
    /**
     * the screen bottom horizontal center position
     */
    public static final int POSITION_BOTTOM_HCENTRE = 7;
    /**
     * the default slider position
     */
    public static final int DEFAULT_POSITION = POSITION_RIGHT_TOP;
    /**
     * the default message foreground color
     */
    public static final Color DEFAULT_MESSAGE_COLOR = Color.GREEN;
    /**
     * default slider background color
     */
    public static final Color DEFAULT_BACKGROUND_COLOR = Color.DARK_GRAY;
    /**
     * the default message font
     */
    public static final Font DEFAULT_FONT = null;
    /**
     * default slide speed
     */
    public static final long DEFAULT_SLIDE_SPEED_DELAY = 10; // 10 milli seconds
    /**
     * default display duration
     */
    public static final long DEFAULT_DISPLAY_DURATION = 3000; // 3000 millisec = 3 sec    
    /**
     * the gap size between frame and message, icon and label text
     */
    private static final int GAP_SIZE = 20;
    /**
     * the screen size
     */
    private static Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * message type error
     */
    public static final int TYPE_ERROR = 0;
    /**
     * message type fail
     */
    public static final int TYPE_FAIL = 1;
    /**
     * message type info
     */
    public static final int TYPE_INFO = 2;
    /**
     * message type processing
     */
    public static final int TYPE_PROCESSING = 3;
    /**
     * message type success
     */
    public static final int TYPE_SUCCESS = 4;
    /**
     * message type warning
     */
    public static final int TYPE_WARNING = 5;
    // the local variables list
    // messag label object to hold the message label
    private JLabel messageLabel = null;
    // the slider's background panel for enabliung background color
    private JPanel backgroundPanel = null;
    // the group layout object
    private GroupLayout layout = null;
    // the jwindow for holding all components
    private JWindow infoWindow = null;
    // the window's location object
    private Point location = null;
    // variables for the sliding effect processing
    private int xUpdater = 0;
    private int yUpdater = 0;
    private int wUpdater = 0;
    private int hUpdater = 0;
    private int updateLimit = 0;
    // the executor service for executing all info display request in sequence
    private final static ExecutorService executorService = Executors.newSingleThreadExecutor();

    /**
     * method to show the JSlidingInfo with the message
     *
     * @param message the message to be displayed
     */
    public static void showInfo(String message) {
        showInfo(message, TYPE_INFO);
    }

    /**
     * method to show the JSlidingInfo with the message and message type
     *
     * @param message the message to be displayed
     * @param messageType the message type
     */
    public static void showInfo(String message, int messageType) {
        showInfo(message, messageType, DEFAULT_POSITION);
    }

    /**
     * method to show the JSlidingInfo with the message, message type and window
     * position
     *
     * @param message the message to be displayed
     * @param messageType the message type
     * @param position the position on the screen where the info window should
     * be displayed
     */
    public static void showInfo(String message, int messageType, int position) {
        showInfo(message, messageType, position, null);
    }

    /**
     * method to show the JSlidingInfo with the message, message type, window
     * position and icon
     *
     * @param message the message to be displayed
     * @param messageType the message type
     * @param position the position on the screen where the info window should
     * be displayed
     * @param icon the custom message icon
     */
    public static void showInfo(String message, int messageType, int position,
            ImageIcon icon) {
        showInfo(message, messageType, position, icon, DEFAULT_DISPLAY_DURATION);
    }

    /**
     * method to show the JSlidingInfo with the message, message type, window
     * position, icon and display duration
     *
     * @param message the message to be displayed
     * @param messageType the message type
     * @param position the position on the screen where the info window should
     * be displayed
     * @param icon the custom message icon
     * @param displayDuration the display duration in milliseconds
     */
    public static void showInfo(String message, int messageType, int position,
            ImageIcon icon, long displayDuration) {
        showInfo(message, messageType, position, icon, displayDuration,
                DEFAULT_MESSAGE_COLOR, DEFAULT_BACKGROUND_COLOR);
    }

    /**
     * method to show the JSlidingInfo with the message, message type, window
     * position, icon, display duration, message text color and background color
     *
     * @param message the message to be displayed
     * @param messageType the message type
     * @param position the position on the screen where the info window should
     * be displayed
     * @param icon the custom message icon
     * @param displayDuration the display duration in milliseconds
     * @param messageColor the message foreground color
     * @param backgroundColor the message background color
     */
    public static void showInfo(String message, int messageType, int position,
            ImageIcon icon, long displayDuration, Color messageColor,
            Color backgroundColor) {
        showInfo(message, messageType, position, icon, displayDuration,
                messageColor, backgroundColor, DEFAULT_FONT);
    }

    /**
     * method to show the JSlidingInfo with the message, message type, window
     * position, icon, display duration, message text color, background color
     * and message font
     *
     * @param message the message to be displayed
     * @param messageType the message type
     * @param position the position on the screen where the info window should
     * be displayed
     * @param icon the custom message icon
     * @param displayDuration the display duration in milliseconds
     * @param messageColor the message foreground color
     * @param backgroundColor the message background color
     * @param messageFont the message font
     */
    public static void showInfo(String message, int messageType, int position,
            ImageIcon icon, long displayDuration, Color messageColor,
            Color backgroundColor, Font messageFont) {
        showInfo(message, messageType, position, icon, displayDuration,
                messageColor, backgroundColor, messageFont, DEFAULT_SLIDE_SPEED_DELAY);
    }

    /**
     * method to show the JSlidingInfo with the message, message type, window
     * position, icon, display duration, message text color, background color,
     * message font and slide speed delay
     *
     * @param message the message to be displayed
     * @param messageType the message type
     * @param position the position on the screen where the info window should
     * be displayed
     * @param icon the custom message icon
     * @param displayDuration the display duration in milliseconds
     * @param messageColor the message foreground color
     * @param backgroundColor the message background color
     * @param messageFont the message font
     * @param slideSpeedDelay the sliding window slide speed delay in
     * milliseconds. lower the value, higher the slide speed
     */
    public static void showInfo(final String message, final int messageType, final int position,
            final ImageIcon icon, final long displayDuration, final Color messageColor,
            final Color backgroundColor, final Font messageFont, final long slideSpeedDelay) {

        try {
            // create a new runnable object and pass it to the executor service for execution
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    // creata a new JSlidingInfo object and call the displayInfo method with the 
                    // parameters set
                    JSlidingInfo jsi = new JSlidingInfo();
                    jsi.displayInfo(message, messageType, position, icon,
                            displayDuration, messageColor, backgroundColor, messageFont,
                            slideSpeedDelay);
                }
            });

        } catch (RejectedExecutionException ex) {
            // on RejectedExecutionException shutdown the executor service
            executorService.shutdown();
            // log error
            Logger.getLogger(JSlidingInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * privatized constructor to prevent usage
     */
    private JSlidingInfo() {
    }

    /**
     * the local method to show the JSlidingInfo with the message, message type,
     * window position, icon, display duration, message text color, background
     * color, message font and slide speed delay
     *
     * @param message the message to be displayed
     * @param messageType the message type
     * @param position the position on the screen where the info window should
     * be displayed
     * @param icon the custom message icon
     * @param displayDuration the display duration in milliseconds
     * @param messageColor the message foreground color
     * @param backgroundColor the message background color
     * @param messageFont the message font
     * @param slideSpeedDelay the sliding window slide speed delay in
     * milliseconds. lower the value, higher the slide speed
     */
    private void displayInfo(final String message, final int messageType, final int position,
            final ImageIcon icon, final long displayDuration, final Color messageColor,
            final Color backgroundColor, final Font messageFont, final long slideSpeedDelay) {

        // format the message to include the html tags
        String msg = formatMessage(message);

        // create the lable object for the message
        messageLabel = new JLabel(msg);

        // if message font is present then set the message font
        if (messageFont != null) {
            messageLabel.setFont(messageFont);
        }

        // if message text color is present then set the message text color
        if (messageColor != null) {
            messageLabel.setForeground(messageColor);
        }

        // if info icon is present then set it as the message lable icon
        if (icon != null) {
            messageLabel.setIcon(icon);
        } // else get the default icon for the message type and set the message label icon
        else {
            messageLabel.setIcon(getIcon(messageType));
        }

        // set the icon and text gap
        messageLabel.setIconTextGap(GAP_SIZE);

        // create the background panel
        backgroundPanel = new JPanel();

        // set the background panel border
        backgroundPanel.setBorder(new LineBorder(Color.black, GAP_SIZE / 4));

        // if backgroundcolor is present then set the background panel 
        // background color
        if (backgroundColor != null) {
            backgroundPanel.setBackground(backgroundColor);
        }

        // create the group layout
        layout = new GroupLayout(backgroundPanel);

        // set the layout to the background panel
        backgroundPanel.setLayout(layout);

        // add the message lable to the background panel layout
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(GAP_SIZE, GAP_SIZE, GAP_SIZE)
                .addComponent(messageLabel)
                .addContainerGap(GAP_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(GAP_SIZE, GAP_SIZE, GAP_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(messageLabel))
                .addContainerGap(GAP_SIZE, Short.MAX_VALUE)));

        // create the info window
        infoWindow = new JWindow();

        // add the background panel to the info window             
        infoWindow.add(backgroundPanel);

        // pack the window
        infoWindow.pack();

        // set allways on top feature to the info window
        infoWindow.setAlwaysOnTop(true);

        // get window location from the selected location index
        location = getLocation(position, infoWindow.getSize());
        // set the window location
        infoWindow.setLocation(location);
        // show window
        infoWindow.setVisible(true);
        // set the sliding effect processing variables values for sliding in effect
        // based on the position
        setUpdaterForSlideIn(position);
        // reset the window size prior sliding effect based on the position
        resetWindowSize(infoWindow, position);


        try {
            // get the curent thread refference for sliding effect processing
            Thread t = Thread.currentThread();

            // start sliding (in)
            slide(t, slideSpeedDelay);

            // wait for the display duration
            t.sleep(displayDuration);

            // set the updater values for sliding out effect
            setUpdaterForSlideOut();

            // start sliding (out)      
            slide(t, slideSpeedDelay);

            // hide window
            infoWindow.setVisible(false);

            // clear resources and dispose
            infoWindow.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(JSlidingInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * method to reset the window size prior sliding effect based on the
     * position
     *
     * @param window the window whoes size is to be reset
     * @param position the user selected JSlidingInfo window position
     */
    private void resetWindowSize(JWindow window, int position) {
        switch (position) {
            case POSITION_LEFT_TOP: {
                window.setSize(0, window.getSize().height);
            }
            break;
            case POSITION_TOP_HCENTRE: {
                window.setSize(window.getSize().width, 0);
            }
            break;

            case POSITION_RIGHT_TOP: {
                window.setSize(0, window.getSize().height);
            }
            break;

            case POSITION_RIGHT_VCENTRE: {
                window.setSize(0, window.getSize().height);
            }
            break;

            case POSITION_RIGHT_BOTTOM: {
                window.setSize(0, window.getSize().height);
            }
            break;

            case POSITION_BOTTOM_HCENTRE: {
                window.setSize(window.getSize().width, 0);
            }
            break;

            case POSITION_LEFT_BOTTOM: {
                window.setSize(0, window.getSize().height);
            }
            break;

            case POSITION_LEFT_VCENTRE: {
                window.setSize(0, window.getSize().height);
            }
            break;

        }
    }

    /**
     * method to set the sliding effect processing variables values for sliding
     * in effect based on the position
     *
     * @param position the user selected JSlidingInfo window position
     */
    private void setUpdaterForSlideIn(int position) {
        switch (position) {
            case POSITION_LEFT_TOP: {
                xUpdater = 0;
                yUpdater = 0;
                wUpdater = 1;
                hUpdater = 0;
                updateLimit = infoWindow.getSize().width;
            }
            break;
            case POSITION_TOP_HCENTRE: {
                xUpdater = 0;
                yUpdater = 0;
                wUpdater = 0;
                hUpdater = 1;
                updateLimit = infoWindow.getSize().height;
            }
            break;

            case POSITION_RIGHT_TOP: {
                xUpdater = -1;
                yUpdater = 0;
                wUpdater = 1;
                hUpdater = 0;
                updateLimit = infoWindow.getSize().width;
            }
            break;

            case POSITION_RIGHT_VCENTRE: {
                xUpdater = -1;
                yUpdater = 0;
                wUpdater = 1;
                hUpdater = 0;
                updateLimit = infoWindow.getSize().width;
            }
            break;

            case POSITION_RIGHT_BOTTOM: {
                xUpdater = -1;
                yUpdater = 0;
                wUpdater = 1;
                hUpdater = 0;
                updateLimit = infoWindow.getSize().width;
            }
            break;

            case POSITION_BOTTOM_HCENTRE: {
                xUpdater = 0;
                yUpdater = -1;
                wUpdater = 0;
                hUpdater = 1;
                updateLimit = infoWindow.getSize().height;
            }
            break;

            case POSITION_LEFT_BOTTOM: {
                xUpdater = 0;
                yUpdater = 0;
                wUpdater = 1;
                hUpdater = 0;
                updateLimit = infoWindow.getSize().width;
            }
            break;

            case POSITION_LEFT_VCENTRE: {
                xUpdater = 0;
                yUpdater = 0;
                wUpdater = 1;
                hUpdater = 0;
                updateLimit = infoWindow.getSize().width;
            }
            break;

        }
    }

    /**
     * method to set the sliding effect processing variables values for sliding
     * out effect
     */
    private void setUpdaterForSlideOut() {
        xUpdater *= -1;
        yUpdater *= -1;
        wUpdater *= -1;
        hUpdater *= -1;
    }

    /**
     * method to process the sliding effect
     *
     * @param thread the processing thread object
     * @param slideSpeedDelay the slide speed delay value
     * @throws InterruptedException
     */
    private void slide(Thread thread, long slideSpeedDelay) throws InterruptedException {
        // till the update limt
        for (int i = 0; i < updateLimit; i++) {
            // update window location
            infoWindow.setLocation(infoWindow.getLocation().x + xUpdater, infoWindow.getLocation().y + yUpdater);
            // update window dimension
            infoWindow.setSize(infoWindow.getSize().width + wUpdater, infoWindow.getSize().height + hUpdater);
            // sleep for the slide speed delay
            thread.sleep(slideSpeedDelay);
        }
    }

    /**
     * method to format the message
     *
     * @param message the message that is to be formatted
     * @return html formatted message
     */
    private String formatMessage(String message) {
        // trim leading and trainling white spaces
        message = message.trim();
        // replace the new line char with the html break tag
        message = message.replace("\n", "<br></br>");
        // set html header and footer tags to the message
        // the style formatting prevents the label message 
        // from wrapping when the window resizes
        message = "<html><body style='white-space:nowrap'>" + message + "</body></html>";
        // return the formated message
        return message;
    }

    /**
     * method to get the window location from the selected window location index
     *
     * @param position the user selected JSlidingInfo window position
     * @param frameSize the JSlidingInfo window size
     * @return Point location based on position
     */
    private Point getLocation(int position, Dimension frameSize) {

        switch (position) {
            case POSITION_LEFT_TOP:
                // x coordinate is 0
                // y coordinate is 20% of the screen height
                return new Point(0, (int) (SCREEN_SIZE.height * 0.2));
            case POSITION_TOP_HCENTRE:
                // x coordinate is the half the screen width minus half the slider window width
                // y coordinate is 0
                return new Point((SCREEN_SIZE.width / 2) - (frameSize.width / 2), 0);
            case POSITION_RIGHT_TOP:
                // x coordinate is the screen width
                // y coordinate is 20% of screen height
                return new Point(SCREEN_SIZE.width, (int) (SCREEN_SIZE.height * 0.2));
            case POSITION_RIGHT_VCENTRE:
                // x coordinate is the screen width
                // y coordinate is the half the screen height minus half the slider window height
                return new Point(SCREEN_SIZE.width, (SCREEN_SIZE.height / 2) - (frameSize.height / 2));
            case POSITION_RIGHT_BOTTOM:
                // x coordinate is the screen width
                // y coordinate is 70% of screen height
                return new Point(SCREEN_SIZE.width, (int) (SCREEN_SIZE.height * 0.7));
            case POSITION_BOTTOM_HCENTRE:
                // x coordinate is the half the screen width minus half the slider window width
                // y coordinate is screen height
                return new Point((SCREEN_SIZE.width / 2) - (frameSize.width / 2), SCREEN_SIZE.height);
            case POSITION_LEFT_BOTTOM:
                // x coordinate is 0
                // y coordinate is 70% of screen height
                return new Point(0, (int) (SCREEN_SIZE.height * 0.7));
            case POSITION_LEFT_VCENTRE:
                // x coordinate is 0
                // y coordinate is the half the screen height minus half the slider window height
                return new Point(0, (SCREEN_SIZE.height / 2) - (frameSize.height / 2));
        }
        // if unrecognised position return null
        return null;
    }

    /**
     * method to get the icon image based on the message type
     *
     * @param messageType the user selected message type
     * @return the default image icon based on message type
     */
    private ImageIcon getIcon(int messageType) {
        switch (messageType) {
            case TYPE_ERROR:
                return new javax.swing.ImageIcon(this.getClass().getResource("/com/deepak/jslidinginfo/resources/error.png"));
            case TYPE_FAIL:
                return new javax.swing.ImageIcon(JSlidingInfo.class.getResource("/com/deepak/jslidinginfo/resources/fail.png"));
            case TYPE_INFO:
                return new javax.swing.ImageIcon(JSlidingInfo.class.getResource("/com/deepak/jslidinginfo/resources/info.png"));
            case TYPE_PROCESSING:
                return new javax.swing.ImageIcon(JSlidingInfo.class.getResource("/com/deepak/jslidinginfo/resources/processing.png"));
            case TYPE_SUCCESS:
                return new javax.swing.ImageIcon(JSlidingInfo.class.getResource("/com/deepak/jslidinginfo/resources/success.png"));
            case TYPE_WARNING:
                return new javax.swing.ImageIcon(JSlidingInfo.class.getResource("/com/deepak/jslidinginfo/resources/warning.png"));
        }
        return null;
    }
}
