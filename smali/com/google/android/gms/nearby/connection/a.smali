.class public interface abstract Lcom/google/android/gms/nearby/connection/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/connection/a$d;,
        Lcom/google/android/gms/nearby/connection/a$b;,
        Lcom/google/android/gms/nearby/connection/a$c;,
        Lcom/google/android/gms/nearby/connection/a$a;,
        Lcom/google/android/gms/nearby/connection/a$e;
    }
.end annotation


# static fields
.field public static final c:J = 0x0L

.field public static final d:I = 0x490

.field public static final e:I = 0x1000

.field public static final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/util/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/nearby/connection/a;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;JLcom/google/android/gms/nearby/connection/a$c;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/gms/nearby/connection/a$c;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JLcom/google/android/gms/nearby/connection/a$a;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/nearby/connection/AppMetadata;",
            "J",
            "Lcom/google/android/gms/nearby/connection/a$a;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$e;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/nearby/connection/a$b;Lcom/google/android/gms/nearby/connection/a$d;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[B",
            "Lcom/google/android/gms/nearby/connection/a$b;",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[BLcom/google/android/gms/nearby/connection/a$d;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "[B",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;)Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[B)V
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/util/List;[B)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;[B)V"
        }
    .end annotation
.end method

.method public abstract b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lcom/google/android/gms/common/api/g;)Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[B)V
.end method

.method public abstract b(Lcom/google/android/gms/common/api/g;Ljava/util/List;[B)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;[B)V"
        }
    .end annotation
.end method

.method public abstract c(Lcom/google/android/gms/common/api/g;)V
.end method

.method public abstract c(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
.end method

.method public abstract d(Lcom/google/android/gms/common/api/g;)V
.end method
