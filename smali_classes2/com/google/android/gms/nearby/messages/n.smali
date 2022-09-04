.class public final Lcom/google/android/gms/nearby/messages/n;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/n$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/nearby/messages/n;


# instance fields
.field public final b:Z

.field private final c:Lcom/google/android/gms/nearby/messages/Strategy;

.field private final d:Lcom/google/android/gms/nearby/messages/MessageFilter;

.field private final e:Lcom/google/android/gms/nearby/messages/m;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/n$a;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/n$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/n$a;->a()Lcom/google/android/gms/nearby/messages/n;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/nearby/messages/n;->a:Lcom/google/android/gms/nearby/messages/n;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/nearby/messages/Strategy;Lcom/google/android/gms/nearby/messages/MessageFilter;Lcom/google/android/gms/nearby/messages/m;Z)V
    .locals 0
    .param p3    # Lcom/google/android/gms/nearby/messages/m;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/n;->c:Lcom/google/android/gms/nearby/messages/Strategy;

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/n;->d:Lcom/google/android/gms/nearby/messages/MessageFilter;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/n;->e:Lcom/google/android/gms/nearby/messages/m;

    iput-boolean p4, p0, Lcom/google/android/gms/nearby/messages/n;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/nearby/messages/Strategy;Lcom/google/android/gms/nearby/messages/MessageFilter;Lcom/google/android/gms/nearby/messages/m;ZLcom/google/android/gms/nearby/messages/n$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/nearby/messages/n;-><init>(Lcom/google/android/gms/nearby/messages/Strategy;Lcom/google/android/gms/nearby/messages/MessageFilter;Lcom/google/android/gms/nearby/messages/m;Z)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/nearby/messages/Strategy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/n;->c:Lcom/google/android/gms/nearby/messages/Strategy;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/nearby/messages/MessageFilter;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/n;->d:Lcom/google/android/gms/nearby/messages/MessageFilter;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/nearby/messages/m;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/n;->e:Lcom/google/android/gms/nearby/messages/m;

    return-object v0
.end method
