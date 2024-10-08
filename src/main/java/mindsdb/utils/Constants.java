package mindsdb.utils;

import com.google.gson.Gson;

public class Constants {

    public static final String MANAGED_ENDPOINT = "/api/login";
    public static final String CLOUD_ENDPOINT = "/cloud/login";
    public static final String PASSWORD = "password";
    public static final String MINDS_DB = "mindsdb";
    public static final String USERNAME = "username";
    public static final String EMAIL = "email";
    public static final String QUERY = "query";
    public static final String PROJECT_NAME_ROUTE_PARAM = "projectName";
    public static final String DATABASE_NAME_ROUTE_PARAM = "databaseName";
    public static final String MODEL_NAME_ROUTE_PARAM = "modelName";
    public static final String JOB_NAME_ROUTE_PARAM = "jobName";
    public static final String DB = "db";
    public static final String CONTEXT = "context";
    public static final Gson gson = new Gson();
    public static final String SERVER_STATUS_ENDPOINT = "/api/status";
    public static final String SQL_QUERY_ENDPOINT = "/api/sql/query";
    public static final String LIST_PROJECT_ENDPOINT = "/api/projects";
    public static final String GET_PROJECT_ENDPOINT = "/api/projects/{" + PROJECT_NAME_ROUTE_PARAM + "}";
    public static final String LIST_DATABASE_ENDPOINT = "/api/databases";
    public static final String GET_DATABASE_ENDPOINT = "/api/databases/{" + DATABASE_NAME_ROUTE_PARAM + "}";
    public static final String LIST_MODEL_ENDPOINT = "/api/projects/{" + PROJECT_NAME_ROUTE_PARAM + "}/models";
    public static final String GET_MODEL_ENDPOINT = "/api/projects/{" + PROJECT_NAME_ROUTE_PARAM + "}/models/{"
            + MODEL_NAME_ROUTE_PARAM + "}";
    public static final String LIST_TABLE_ENDPOINT = "/api/databases/{" + DATABASE_NAME_ROUTE_PARAM + "}/tables";

    public static final String LIST_JOBS_ENDPOINT = "/api/projects/{" + PROJECT_NAME_ROUTE_PARAM + "}/jobs";
    public static final String GET_JOB_ENDPOINT = "/api/projects/{" + PROJECT_NAME_ROUTE_PARAM + "}/jobs/{"
            + JOB_NAME_ROUTE_PARAM + "}";
}
