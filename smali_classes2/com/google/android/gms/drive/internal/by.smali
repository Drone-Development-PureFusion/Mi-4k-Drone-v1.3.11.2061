.class public final Lcom/google/android/gms/drive/internal/by;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/google/android/gms/common/internal/ab;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/ab;

    const-string v1, "GmsDrive"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/ab;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/internal/by;->a:Lcom/google/android/gms/common/internal/ab;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-static {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/by;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/by;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/common/internal/ab;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/by;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/by;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p0, p2, p1}, Lcom/google/android/gms/common/internal/ab;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/by;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/by;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/ab;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
