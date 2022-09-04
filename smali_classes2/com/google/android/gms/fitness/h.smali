.class public interface abstract Lcom/google/android/gms/fitness/h;
.super Ljava/lang/Object;


# virtual methods
.method public abstract a(Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataSourcesRequest;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        anyOf = {
            "android.permission.ACCESS_FINE_LOCATION",
            "android.permission.BODY_SENSORS"
        }
        conditional = true
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/DataSourcesRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/fitness/result/DataSourcesResult;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/b;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/b;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/c;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        anyOf = {
            "android.permission.ACCESS_FINE_LOCATION",
            "android.permission.BODY_SENSORS"
        }
        conditional = true
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/c;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/c;Lcom/google/android/gms/fitness/request/b;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        anyOf = {
            "android.permission.ACCESS_FINE_LOCATION",
            "android.permission.BODY_SENSORS"
        }
        conditional = true
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/c;",
            "Lcom/google/android/gms/fitness/request/b;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method
