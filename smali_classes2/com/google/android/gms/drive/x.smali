.class public Lcom/google/android/gms/drive/x;
.super Lcom/google/android/gms/drive/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/x$a;
    }
.end annotation


# instance fields
.field private d:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;ZIZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/drive/j;-><init>(Ljava/lang/String;ZI)V

    iput-boolean p4, p0, Lcom/google/android/gms/drive/x;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ZIZLcom/google/android/gms/drive/x$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/drive/x;-><init>(Ljava/lang/String;ZIZ)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/drive/j;)Lcom/google/android/gms/drive/x;
    .locals 2

    new-instance v1, Lcom/google/android/gms/drive/x$a;

    invoke-direct {v1}, Lcom/google/android/gms/drive/x$a;-><init>()V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/drive/j;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/drive/x$a;->a(I)Lcom/google/android/gms/drive/j$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/x$a;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/j;->b()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/drive/x$a;->a(Z)Lcom/google/android/gms/drive/j$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/x$a;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/j;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/drive/x$a;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/j$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/x$a;

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/drive/x$a;->b()Lcom/google/android/gms/drive/j;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/x;

    return-object v0
.end method


# virtual methods
.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/drive/x;->d:Z

    return v0
.end method
