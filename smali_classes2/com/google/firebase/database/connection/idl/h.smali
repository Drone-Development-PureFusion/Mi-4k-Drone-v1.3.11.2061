.class public interface abstract Lcom/google/firebase/database/connection/idl/h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/database/connection/idl/h$a;
    }
.end annotation


# virtual methods
.method public abstract compareAndPut(Ljava/util/List;Lcom/google/android/gms/c/e;Ljava/lang/String;Lcom/google/firebase/database/connection/idl/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Ljava/lang/String;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation
.end method

.method public abstract initialize()V
.end method

.method public abstract interrupt(Ljava/lang/String;)V
.end method

.method public abstract isInterrupted(Ljava/lang/String;)Z
.end method

.method public abstract listen(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/g;JLcom/google/firebase/database/connection/idl/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/g;",
            "J",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation
.end method

.method public abstract merge(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onDisconnectCancel(Ljava/util/List;Lcom/google/firebase/database/connection/idl/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onDisconnectMerge(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onDisconnectPut(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation
.end method

.method public abstract purgeOutstandingWrites()V
.end method

.method public abstract put(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation
.end method

.method public abstract refreshAuthToken()V
.end method

.method public abstract refreshAuthToken2(Ljava/lang/String;)V
.end method

.method public abstract resume(Ljava/lang/String;)V
.end method

.method public abstract setup(Lcom/google/firebase/database/connection/idl/ConnectionConfig;Lcom/google/firebase/database/connection/idl/e;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/i;)V
.end method

.method public abstract shutdown()V
.end method

.method public abstract unlisten(Ljava/util/List;Lcom/google/android/gms/c/e;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            ")V"
        }
    .end annotation
.end method
