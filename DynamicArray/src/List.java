public interface List<E> {

    public static final int ELEMENT_NOT_FOUND = -1;
    void clear();

    int size();

    boolean isEmpty();

    /**
     * 是否包含某个元素
     *
     * @param element
     * @return
     */
    boolean contains(E element);


    /**
     * 获取index位置的元素
     *
     * @param index
     * @return
     */
    E get(int index);

    E set(int index, E element);

    void add(E element);

    /**
     * 在index位置插入一个元素
     *
     * @param index
     * @param element
     */
    void add(int index, E element);

    /**
     * 删除index位置的元素
     *
     * @param index
     * @return
     */
    E remove(int index);

    /**
     * 查看元素的索引
     *
     * @param element
     * @return
     */
    int indexOf(E element);

}
