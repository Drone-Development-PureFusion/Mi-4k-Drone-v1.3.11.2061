.class public Lcom/google/android/gms/drive/w$a;
.super Lcom/google/android/gms/drive/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/drive/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(I)Lcom/google/android/gms/drive/j$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/w$a;->b(I)Lcom/google/android/gms/drive/w$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/String;)Lcom/google/android/gms/drive/j$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/w$a;->b(Ljava/lang/String;)Lcom/google/android/gms/drive/w$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Z)Lcom/google/android/gms/drive/j$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/w$a;->b(Z)Lcom/google/android/gms/drive/w$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Lcom/google/android/gms/drive/j;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/drive/w$a;->c()Lcom/google/android/gms/drive/w;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/drive/w$a;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/drive/w$a;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/drive/j$a;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/j$a;

    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/drive/w$a;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/drive/j$a;->a(Z)Lcom/google/android/gms/drive/j$a;

    return-object p0
.end method

.method public c()Lcom/google/android/gms/drive/w;
    .locals 7

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/drive/w$a;->a()V

    new-instance v0, Lcom/google/android/gms/drive/w;

    iget-object v1, p0, Lcom/google/android/gms/drive/w$a;->a:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/google/android/gms/drive/w$a;->b:Z

    iget v5, p0, Lcom/google/android/gms/drive/w$a;->c:I

    move-object v4, v3

    move-object v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/drive/w;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILcom/google/android/gms/drive/w$1;)V

    return-object v0
.end method
