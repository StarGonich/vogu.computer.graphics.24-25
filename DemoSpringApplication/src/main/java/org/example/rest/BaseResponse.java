package org.example.rest;

public class BaseResponse<TBody> {

    public final Boolean success;
    public final TBody body;
    public final ErrorResponse error;

    private BaseResponse( Boolean success, TBody body, ErrorResponse error ) {
        this.success = success;
        this.body = body;
        this.error = error;
    }

    public static <TBody> BaseResponse<TBody> ok( TBody body ) {
        return new BaseResponse<>( true, body, null );
    }

    public static <TBody> BaseResponse<TBody> fail( ErrorResponse error ) {
        return new BaseResponse<>( false, null, error );
    }
}
