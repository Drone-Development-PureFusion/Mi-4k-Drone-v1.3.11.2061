.class Lcom/google/android/gms/internal/ahw$d$1;
.super Lcom/google/android/gms/internal/aia$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ahw$d;->a(Lcom/google/android/gms/signin/internal/SignInResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ahw;

.field final synthetic b:Lcom/google/android/gms/signin/internal/SignInResponse;

.field final synthetic c:Lcom/google/android/gms/internal/ahw$d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahw$d;Lcom/google/android/gms/internal/ahz;Lcom/google/android/gms/internal/ahw;Lcom/google/android/gms/signin/internal/SignInResponse;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ahw$d$1;->c:Lcom/google/android/gms/internal/ahw$d;

    iput-object p3, p0, Lcom/google/android/gms/internal/ahw$d$1;->a:Lcom/google/android/gms/internal/ahw;

    iput-object p4, p0, Lcom/google/android/gms/internal/ahw$d$1;->b:Lcom/google/android/gms/signin/internal/SignInResponse;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aia$a;-><init>(Lcom/google/android/gms/internal/ahz;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahw$d$1;->a:Lcom/google/android/gms/internal/ahw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahw$d$1;->b:Lcom/google/android/gms/signin/internal/SignInResponse;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ahw;->a(Lcom/google/android/gms/internal/ahw;Lcom/google/android/gms/signin/internal/SignInResponse;)V

    return-void
.end method
