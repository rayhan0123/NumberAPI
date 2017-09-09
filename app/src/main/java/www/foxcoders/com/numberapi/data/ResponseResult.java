package www.foxcoders.com.numberapi.data;

/**
 * Created by Ray on 9/9/2017.
 */

public interface ResponseResult<T> {
    void onSuccess(T t);
    void onFailure(Object o);
}
