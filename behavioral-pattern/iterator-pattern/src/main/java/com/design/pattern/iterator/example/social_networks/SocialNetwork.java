package com.design.pattern.iterator.example.social_networks;

import com.design.pattern.iterator.example.iterators.ProfileIterator;

/**
 * SocialNetwork
 *
 * @author Wenzhou
 * @since 2023/6/2 15:57
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
