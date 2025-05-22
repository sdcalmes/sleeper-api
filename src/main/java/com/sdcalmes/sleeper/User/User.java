package com.sdcalmes.sleeper.User;

/**
 * The type User.
 */
public class User {

    private static final String AVATAR_CDN_BASE_URL = "https://sleepercdn.com/avatars/";
    private static final String AVATAR_THUMBS_CDN_BASE_URL = "https://sleepercdn.com/avatars/thumbs/";

    private String username;
    private String user_id;
    private String display_name;
    private boolean is_bot;
    private String avatar;

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplay_name() {
        return display_name;
    }

    /**
     * Is is bot boolean.
     *
     * @return the boolean
     */
    public boolean isIs_bot() {
        return is_bot;
    }

    /**
     * Gets avatar.
     *
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Gets the full URL for the user's avatar.
     * Returns null if the avatar ID is null.
     * @return The full URL string or null.
     */
    public String getFullAvatarUrl() {
        if (this.avatar == null) {
            return null;
        }
        return AVATAR_CDN_BASE_URL + this.avatar;
    }

    /**
     * Gets the thumbnail URL for the user's avatar.
     * Returns null if the avatar ID is null.
     * @return The thumbnail URL string or null.
     */
    public String getThumbnailAvatarUrl() {
        if (this.avatar == null) {
            return null;
        }
        return AVATAR_THUMBS_CDN_BASE_URL + this.avatar;
    }
}
