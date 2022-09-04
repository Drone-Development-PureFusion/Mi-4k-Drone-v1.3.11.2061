.class Lcom/google/android/gms/internal/aen$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/auth/a/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Landroid/accounts/Account;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Landroid/accounts/Account;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aen$b;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/aen$b;->b:Landroid/accounts/Account;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aen$b;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aen$b;->b:Landroid/accounts/Account;

    return-object v0
.end method
