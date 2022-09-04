.class public Lcom/google/android/gms/drive/w;
.super Lcom/google/android/gms/drive/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/w$a;
    }
.end annotation


# instance fields
.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p5}, Lcom/google/android/gms/drive/j;-><init>(Ljava/lang/String;ZI)V

    iput-object p3, p0, Lcom/google/android/gms/drive/w;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/drive/w;->e:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILcom/google/android/gms/drive/w$1;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/drive/w;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/drive/j;)Lcom/google/android/gms/drive/w;
    .locals 2

    new-instance v1, Lcom/google/android/gms/drive/w$a;

    invoke-direct {v1}, Lcom/google/android/gms/drive/w$a;-><init>()V

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/j;->c()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "May not set a conflict strategy for new file creation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/drive/j;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/drive/w$a;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/j$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/w$a;

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/drive/j;->b()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/drive/w$a;->a(Z)Lcom/google/android/gms/drive/j$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/w$a;

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/drive/w$a;->b()Lcom/google/android/gms/drive/j;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/w;

    return-object v0
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/w;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/w;->e:Ljava/lang/String;

    return-object v0
.end method
