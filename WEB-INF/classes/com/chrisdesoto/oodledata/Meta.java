
package com.chrisdesoto.oodledata;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Meta {

    private int total;
    private int returned;
    private int first;
    private int last;
    private String searchTime;
    private Search search;
    private Post post;
    private int currentTime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param currentTime
     * @param total
     * @param post
     * @param last
     * @param search
     * @param searchTime
     * @param first
     * @param returned
     */
    public Meta(int total, int returned, int first, int last, String searchTime, Search search, Post post, int currentTime) {
        this.total = total;
        this.returned = returned;
        this.first = first;
        this.last = last;
        this.searchTime = searchTime;
        this.search = search;
        this.post = post;
        this.currentTime = currentTime;
    }

    /**
     * 
     * @return
     *     The total
     */
    public int getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    public Meta withTotal(int total) {
        this.total = total;
        return this;
    }

    /**
     * 
     * @return
     *     The returned
     */
    public int getReturned() {
        return returned;
    }

    /**
     * 
     * @param returned
     *     The returned
     */
    public void setReturned(int returned) {
        this.returned = returned;
    }

    public Meta withReturned(int returned) {
        this.returned = returned;
        return this;
    }

    /**
     * 
     * @return
     *     The first
     */
    public int getFirst() {
        return first;
    }

    /**
     * 
     * @param first
     *     The first
     */
    public void setFirst(int first) {
        this.first = first;
    }

    public Meta withFirst(int first) {
        this.first = first;
        return this;
    }

    /**
     * 
     * @return
     *     The last
     */
    public int getLast() {
        return last;
    }

    /**
     * 
     * @param last
     *     The last
     */
    public void setLast(int last) {
        this.last = last;
    }

    public Meta withLast(int last) {
        this.last = last;
        return this;
    }

    /**
     * 
     * @return
     *     The searchTime
     */
    public String getSearchTime() {
        return searchTime;
    }

    /**
     * 
     * @param searchTime
     *     The search_time
     */
    public void setSearchTime(String searchTime) {
        this.searchTime = searchTime;
    }

    public Meta withSearchTime(String searchTime) {
        this.searchTime = searchTime;
        return this;
    }

    /**
     * 
     * @return
     *     The search
     */
    public Search getSearch() {
        return search;
    }

    /**
     * 
     * @param search
     *     The search
     */
    public void setSearch(Search search) {
        this.search = search;
    }

    public Meta withSearch(Search search) {
        this.search = search;
        return this;
    }

    /**
     * 
     * @return
     *     The post
     */
    public Post getPost() {
        return post;
    }

    /**
     * 
     * @param post
     *     The post
     */
    public void setPost(Post post) {
        this.post = post;
    }

    public Meta withPost(Post post) {
        this.post = post;
        return this;
    }

    /**
     * 
     * @return
     *     The currentTime
     */
    public int getCurrentTime() {
        return currentTime;
    }

    /**
     * 
     * @param currentTime
     *     The current_time
     */
    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public Meta withCurrentTime(int currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Meta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
