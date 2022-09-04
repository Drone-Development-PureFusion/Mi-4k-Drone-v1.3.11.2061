.class public Lcom/google/android/gms/drive/x$a;
.super Lcom/google/android/gms/drive/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/drive/j$a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/drive/x$a;->d:Z

    return-void
.end method


# virtual methods
.method public synthetic a(I)Lcom/google/android/gms/drive/j$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/x$a;->b(I)Lcom/google/android/gms/drive/x$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/String;)Lcom/google/android/gms/drive/j$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/x$a;->b(Ljava/lang/String;)Lcom/google/android/gms/drive/x$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Z)Lcom/google/android/gms/drive/j$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/x$a;->b(Z)Lcom/google/android/gms/drive/x$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Lcom/google/android/gms/drive/j;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/drive/x$a;->c()Lcom/google/android/gms/drive/x;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/drive/x$a;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/drive/j$a;->a(I)Lcom/google/android/gms/drive/j$a;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/drive/x$a;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/drive/j$a;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/j$a;

    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/drive/x$a;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/drive/j$a;->a(Z)Lcom/google/android/gms/drive/j$a;

    return-object p0
.end method

.method public c()Lcom/google/android/gms/drive/x;
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/drive/x$a;->a()V

    new-instance v0, Lcom/google/android/gms/drive/x;

    iget-object v1, p0, Lcom/google/android/gms/drive/x$a;->a:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/google/android/gms/drive/x$a;->b:Z

    iget v3, p0, Lcom/google/android/gms/drive/x$a;->c:I

    iget-boolean v4, p0, Lcom/google/android/gms/drive/x$a;->d:Z

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/x;-><init>(Ljava/lang/String;ZIZLcom/google/android/gms/drive/x$1;)V

    return-object v0
.end method
