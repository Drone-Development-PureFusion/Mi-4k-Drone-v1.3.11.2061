.class Lcom/google/android/gms/c/b$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/c/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/c/b;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/c/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/c/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/c/b$6;->a:Lcom/google/android/gms/c/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public a(Lcom/google/android/gms/c/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/c/b$6;->a:Lcom/google/android/gms/c/b;

    invoke-static {v0}, Lcom/google/android/gms/c/b;->b(Lcom/google/android/gms/c/b;)Lcom/google/android/gms/c/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/c/a;->a()V

    return-void
.end method
