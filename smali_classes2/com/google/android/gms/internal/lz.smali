.class public Lcom/google/android/gms/internal/lz;
.super Ljava/lang/Object;


# static fields
.field private static final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/lz;->b()Z

    move-result v0

    sput-boolean v0, Lcom/google/android/gms/internal/lz;->a:Z

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/lz;->a:Z

    return v0
.end method

.method private static b()Z
    .locals 1

    :try_start_0
    const-string v0, "android.app.Activity"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
