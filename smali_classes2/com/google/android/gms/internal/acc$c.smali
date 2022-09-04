.class Lcom/google/android/gms/internal/acc$c;
.super Lcom/google/android/gms/internal/acl;

# interfaces
.implements Lcom/google/android/gms/internal/adf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/acc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/acl",
        "<TT;>;",
        "Lcom/google/android/gms/internal/adf$b",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/acc;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/acc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/acc$c;->a:Lcom/google/android/gms/internal/acc;

    invoke-direct {p0}, Lcom/google/android/gms/internal/acl;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/acc;Lcom/google/android/gms/internal/acc$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/acc$c;-><init>(Lcom/google/android/gms/internal/acc;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/acl;->b(Ljava/lang/Object;)V

    return-void
.end method
