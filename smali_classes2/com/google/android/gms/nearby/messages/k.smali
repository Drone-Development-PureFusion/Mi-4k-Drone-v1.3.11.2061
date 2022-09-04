.class public final Lcom/google/android/gms/nearby/messages/k;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/k$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/nearby/messages/k;


# instance fields
.field private final b:Lcom/google/android/gms/nearby/messages/Strategy;

.field private final c:Lcom/google/android/gms/nearby/messages/j;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/k$a;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/k$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/k$a;->a()Lcom/google/android/gms/nearby/messages/k;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/nearby/messages/k;->a:Lcom/google/android/gms/nearby/messages/k;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/nearby/messages/Strategy;Lcom/google/android/gms/nearby/messages/j;)V
    .locals 0
    .param p2    # Lcom/google/android/gms/nearby/messages/j;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/k;->b:Lcom/google/android/gms/nearby/messages/Strategy;

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/k;->c:Lcom/google/android/gms/nearby/messages/j;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/nearby/messages/Strategy;Lcom/google/android/gms/nearby/messages/j;Lcom/google/android/gms/nearby/messages/k$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/k;-><init>(Lcom/google/android/gms/nearby/messages/Strategy;Lcom/google/android/gms/nearby/messages/j;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/nearby/messages/Strategy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/k;->b:Lcom/google/android/gms/nearby/messages/Strategy;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/nearby/messages/j;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/k;->c:Lcom/google/android/gms/nearby/messages/j;

    return-object v0
.end method
