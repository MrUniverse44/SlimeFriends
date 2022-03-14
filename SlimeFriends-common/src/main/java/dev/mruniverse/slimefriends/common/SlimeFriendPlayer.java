package dev.mruniverse.slimefriends.common;

import java.util.Collection;

public interface SlimeFriendPlayer {
    boolean isOnline();

    boolean hasFriend(SlimeFriendPlayer player);

    boolean hasRequestFrom(SlimeFriendPlayer player);

    Collection<SlimeFriendPlayer> getFriends();
}
